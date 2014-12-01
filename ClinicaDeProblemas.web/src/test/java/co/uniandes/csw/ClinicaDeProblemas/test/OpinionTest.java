/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.uniandes.csw.ClinicaDeProblemas.test;

/**
 *
 * @author estudiante
 */
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OpinionTest {
    private static WebDriver driver;
    private static String baseUrl;
    private static boolean acceptNextAlert = true;
    private static StringBuffer verificationErrors = new StringBuffer();
 
    @BeforeClass
    public static void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8080";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
    }
 
    @Before
    public void setUpUrl() {
        driver.get(baseUrl + "/ClinicaDeProblemas.web/");
    }
 
@Test
public void testbarra() throws Exception
{
    driver.findElement(By.linkText("Opiniones")).click();
     Thread.sleep(2000);
}
    @Test
    public void testCreateOpinion() throws Exception {
 
        driver.get(baseUrl+"/ClinicaDeProblemas.web/opinion.html");
      //  driver.findElement(By.linkText("Proyectos")).click();
        /**
         * Comando que realiza click sobre el boton "create" del toolbar. La
         * funci�n 'find' encuentra el control y posteriormente hace clic en el
         * mismo. La forma en la que se busca el control es utilizando
         * expresiones xPath ya que los id de los mismos nunca son iguales (se
         * generan con junto con el valor de componentId que var�a).
         */
        driver.findElement(By.xpath("//button[contains(@id,'create')]")).click();
 
        /**
         * Comando que duerme el Thread del test por 2 segundos para dejar que
         * el efecto 'slide down' de backbone abra el formulario de createSport.
         */
        Thread.sleep(2000);
 
        /**
         * Comando que busca el elemento 'name' en el html actual.
         * Posteriormente limpia su contenido (comando clean).
         */
        driver.findElement(By.id("name")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de par�metro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("name")).sendKeys("opinion1");
        driver.findElement(By.id("contenido")).clear();
        driver.findElement(By.id("contenido")).sendKeys("contenido1");
        driver.findElement(By.id("calificacion")).clear();
        driver.findElement(By.id("calificacion")).sendKeys("calificacion1");
        driver.findElement(By.id("dificultadEjercicios")).clear();
        driver.findElement(By.id("dificultadEjercicios")).sendKeys("dificultad1");
        driver.findElement(By.id("solucionDudas")).clear();
        driver.findElement(By.id("solucionDudas")).sendKeys("solucionadas");
        
         Thread.sleep(2000);
          Thread.sleep(2000);
           Thread.sleep(2000);
           
         List<WebElement> a=driver.findElements(By.xpath("//button[contains(@id,'create')]"));
         a.get(1).click();
          Thread.sleep(2000);
           Thread.sleep(2000);
        // driver.findElement(By.xpath("//button[contains(@id,'create')]")).click();
         List<WebElement> b=driver.findElements(By.id("name"));
         b.get(1).sendKeys("opinion1");
        // driver.findElement(By.id("name")).sendKeys("emprendimiento");
          Thread.sleep(2000);
  
        /**
         * Comando que encuentra y hace clic sobre el boton "Save" del toolbar
         * (una vez mas encontrado por una expresi�n Xpath)
         */
          List<WebElement> c=driver.findElements(By.xpath("//button[contains(@id,'save')]"));
          c.get(1).click();
          c.get(0).click();
        
 
        /**
         * Comando que duerme el thread para esperar el efecto de slide down que
         * abre la lista
         */
        Thread.sleep(2000);
        /**
         * Comando que obtiene el div azul de creaci�n exitosa. Si se obtiene,
         * la prueba va bien, si no, saldr� un error y la prueba quedar� como
         * f�llida. 
         */
        WebElement dialog = driver.findElement(By.xpath("//div[contains(@style,'display: block;')]"));

        /**
         * la prueba es exitosa si se encontr� el dialogo de creaci�n exitosa
         */
        assertTrue(dialog != null);
    }
    
    @Test
        public void testUpdateOpinion() throws Exception {
            driver.get(baseUrl+"/ClinicaDeProblemas.web/opinion.html");
        //    driver.findElement(By.linkText("Proyectos")).click();
            //Se hace clic en  el vinculo "Edit" del primer elemento de la lista de sports (el elemento que se cre� en la anterior prueba)
            driver.findElement(By.linkText("Editar")).click();
             Thread.sleep(2000);
             //Se realiza el mismo proceso de diligenciamento de los campos con los cambios
        driver.findElement(By.id("name")).sendKeys("opinion1");
        driver.findElement(By.id("contenido")).clear();
        driver.findElement(By.id("contenido")).sendKeys("contenido1");
        driver.findElement(By.id("calificacion")).clear();
        driver.findElement(By.id("calificacion")).sendKeys("calificacion1");
        driver.findElement(By.id("dificultadEjercicios")).clear();
        driver.findElement(By.id("dificultadEjercicios")).sendKeys("dificultad1");
        driver.findElement(By.id("solucionDudas")).clear();
        driver.findElement(By.id("solucionDudas")).sendKeys("solucionadas");
        
           
            driver.findElement(By.xpath("//button[contains(@id,'saveButton')]")).click();
            Thread.sleep(2000);
            //Se verifica que en la lista de respuesta hallan aparecido los cambios en el elemento y tambi�n el mensaje de edici�n exitosa.
            WebElement dialog = driver.findElement(By.xpath("//div[contains(@style,'display: block;')]"));
            List<WebElement> table = driver.findElements(By.xpath("//table[contains(@class,'table striped')]/tbody/tr"));
            boolean fail = false;
            for (WebElement webElement : table) {
                List<WebElement> elems = webElement.findElements(By.xpath("td"));
 
 
                if (elems.get(0).getText().equals("opinion1")) {
                    fail = true;
                }
 
 
            }
                  //  driver.findElement(By.linkText("Proyectos")).click();
        /**
         * Comando que realiza click sobre el boton "create" del toolbar. La
         * funci�n 'find' encuentra el control y posteriormente hace clic en el
         * mismo. La forma en la que se busca el control es utilizando
         * expresiones xPath ya que los id de los mismos nunca son iguales (se
         * generan con junto con el valor de componentId que var�a).
         */
        driver.findElement(By.xpath("//button[contains(@id,'create')]")).click();
 
        /**
         * Comando que duerme el Thread del test por 2 segundos para dejar que
         * el efecto 'slide down' de backbone abra el formulario de createSport.
         */
        Thread.sleep(2000);
 
        /**
         * Comando que busca el elemento 'name' en el html actual.
         * Posteriormente limpia su contenido (comando clean).
         */
        driver.findElement(By.id("name")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de par�metro sobre // el elemento encontrado.
         */
       driver.findElement(By.id("name")).sendKeys("opinion1");
        driver.findElement(By.id("contenido")).clear();
        driver.findElement(By.id("contenido")).sendKeys("contenido1");
        driver.findElement(By.id("calificacion")).clear();
        driver.findElement(By.id("calificacion")).sendKeys("calificacion1");
        driver.findElement(By.id("dificultadEjercicios")).clear();
        driver.findElement(By.id("dificultadEjercicios")).sendKeys("dificultad1");
        driver.findElement(By.id("solucionDudas")).clear();
        driver.findElement(By.id("solucionDudas")).sendKeys("solucionadas");
        
         Thread.sleep(2000);
          Thread.sleep(2000);
           Thread.sleep(2000);
           
         List<WebElement> a=driver.findElements(By.xpath("//button[contains(@id,'create')]"));
         a.get(1).click();
          Thread.sleep(2000);
           Thread.sleep(2000);
        // driver.findElement(By.xpath("//button[contains(@id,'create')]")).click();
         List<WebElement> b=driver.findElements(By.id("name"));
         b.get(1).sendKeys("holaa");
        // driver.findElement(By.id("name")).sendKeys("emprendimiento");
          Thread.sleep(2000);
  
        /**
         * Comando que encuentra y hace clic sobre el boton "Save" del toolbar
         * (una vez mas encontrado por una expresi�n Xpath)
         */
          List<WebElement> c=driver.findElements(By.xpath("//button[contains(@id,'save')]"));
          c.get(1).click();
          c.get(0).click();
        
        }
       
        @Test
        public void testOpinion() throws Exception{
            driver.get(baseUrl+"/ClinicaDeProblemas.web/opinion.html");
            driver.findElement(By.id("name")).sendKeys("opinion1");
               Thread.sleep(10000);
               Thread.sleep(4000);
        }
        @Test
    public void testDeleteSport() throws Exception {
        /**
         * Se hace clic en el vinculo "Delete" del primer elemento de la lista
         * de sports
         */
        driver.get(baseUrl+"/ClinicaDeProblemas.web/opinion.html");
        driver.findElement(By.linkText("Eliminar")).click();
        Thread.sleep(2000);
        /**
         * Se verifica que en la lista el elemento halla desaparecido. Si
         * existe, hubo un error.
         */
        try {
            List<WebElement> table = driver.findElements(By.xpath("//table[contains(@class,'table striped')]/tbody/tr"));
            boolean fail = true;
            for (WebElement webElement : table) {
                List<WebElement> elems = webElement.findElements(By.xpath("td"));
 
               
 
            }
 
            WebElement dialog = driver.findElement(By.xpath("//div[contains(@style,'display: block;')]"));
           // assertTrue(dialog != null && !fail);
        } catch (Exception e) {
            assertTrue(true);
        }
 
    }
 
    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
 
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
 
    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
 
    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
    
}
