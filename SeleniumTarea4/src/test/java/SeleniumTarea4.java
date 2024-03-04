import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    driver.findElement(By.linkText("2")).click();
    Thread.sleep(1000);
    // Tercera opcion
    List<WebElement> listaOfertas = driver.findElements(By.xpath("//ul[@class=\"srp-results srp-list clearfix\"]/li"));     
    WebElement terceraOferta = listaOfertas.get(2);
    
    terceraOferta.findElement(By.tagName("img")).click();
    Thread.sleep(1000);
    
    List<String> pestañas = new ArrayList<String>(driver.getWindowHandles());
    
    driver.switchTo().window(pestañas.get(1));
    
    String textOferta = driver.getTitle();
    System.out.println(textOferta);
    
    WebElement boton = driver.findElement(By.className("ux-call-to-action__cell"));
    
    assertTrue(boton.isDisplayed());
                  
    //getWindowHandles
    
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }  
    
  }
}