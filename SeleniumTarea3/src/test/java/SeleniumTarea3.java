import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTarea3 {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @Test
  void testWikipedia() {
    WebDriver driver = new ChromeDriver();
    
    try {
    driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    String textoABuscar = "Java";
 
    // Barra busqueda
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Buscar en Wikipedia']")).sendKeys(textoABuscar + "\n");
      

    //Titulo de la página          
    String tituloWeb = driver.findElement(By.xpath("//span[@class='mw-page-title-main']")).getText();
    System.out.println(tituloWeb);
       
    
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }  
    
  }

  @Test
  void testOdoo() {
    WebDriver driver = new ChromeDriver();

    String nombreApellidos = "Emilio Fernandez";
    String email = "a_emilio.fernandez.gallardo@iespablopicasso.es";
    String nombreEmpresa = "Fiumba";
    String telefono = " 635844969";

    try {
      driver.get("https://www.odoo.com/es_ES");
      // Boton Pagina principal
      driver.findElement(By.xpath("//*[@id=\"wrap\"]/section[1]/div/a")).click();
      Thread.sleep(2000);
      // Segundo boton
      driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[1]/div[2]/label[1]"))
          .click();
      Thread.sleep(1000);
      // Boton continuar
      driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[2]/div/div/button")).click();
      Thread.sleep(1000);

      driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(nombreApellidos);
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"company-name\"]")).sendKeys(nombreEmpresa);
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(telefono);
      Thread.sleep(500);
      // Combobox doble
      Select comboxMultiple = new Select(driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[5]/div[1]/div/select")));
      comboxMultiple.selectByIndex(1);
      Thread.sleep(1000);

      Select comboxMultiple2 = new Select(driver.findElement(By.xpath("//*[@id=\"plan\"]")));
      comboxMultiple2.selectByIndex(3);
      Thread.sleep(1000);
      // checkbox
      driver.findElement(By.xpath("//*[@id=\"analytics_opt_in\"]")).click();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  void testWikipediaPicasso() {
    WebDriver driver = new ChromeDriver();

    try {
      driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
      String textoABuscar = "Pablo Picasso";
      // Barra busqueda
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@placeholder='Buscar en Wikipedia']")).sendKeys(textoABuscar + "\n");

      WebElement img = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[2]/td/span/a/img"));
      assertTrue(img.getAttribute("src").contains("220px-Pablo_picasso_1.jpg"));

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}