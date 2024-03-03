import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTarea4 {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @Test
  void testEbay() {
    WebDriver driver = new ChromeDriver();
    
    try {
    driver.get("https://www.ebay.es");

    // En el buscador ponemos PS5
    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Play Station 5 \n");
    Thread.sleep(1000);
    // Vamos a la segunda pagina
    driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[62]/div[2]/span/span/nav/ol/li[2]/a")).click();
    Thread.sleep(2000);
    // Tercera opcion
    driver.findElement(By.xpath("//*[@id=\"item1d69a20d30\"]/div/div[2]/a/div/span")).click();
    // Obtenemos el titulo de la consola que se vende
//    WebElement elemento = driver.findElement(By.className("ux-textspans ux-textspans--BOLD"));
//    System.out.println(elemento.getText()); 
    
    // Vemos si el boton de enviar a la cesta esta
    WebElement botonCesta = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a"));   
    assertTrue("Esta",botonCesta.isDisplayed());
    
    
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }  
    
  }
}