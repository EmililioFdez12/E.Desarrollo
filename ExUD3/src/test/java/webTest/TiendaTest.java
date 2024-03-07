package webTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TiendaTest {

	@ParameterizedTest
	@CsvSource({
		"1,1,3,1,Emilio,Fernandez Gallardo,emilio@gmail.com",
		"2,3,4,2,Emilio,Fernandez Gallardo,emilio@gmail.com",
		"1,2,4,2,Emilio,Fernandez Gallardo,emilio@gmail.com",		
	})
	void testUnicajaSelenium(String tallaCam, String numCam,String tallaPolo, String numPolos, String nombre, String apellidos, String email) {
		  try {
		    WebDriver driver = new ChromeDriver();
		    driver.get("file:///C:/Users/alumnado/Downloads/ExUD3/web/index.html");
		
		    // Obtenemos la lista de enlaces y elegimos el de plantilla
		    List<WebElement> botones = (driver.findElements(By.tagName("a")));
		    botones.get(2).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("txtNombre")).sendKeys(nombre);
		    Thread.sleep(500);
		    driver.findElement(By.id("txtApellidos")).sendKeys(apellidos);
		    Thread.sleep(500);
		    driver.findElement(By.id("txtEmail")).sendKeys(email);
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector("input[type='radio'][value='Envio']")).click();
		    Thread.sleep(500);
		    Select comboBox = new Select(driver.findElement(By.id("comboTallaCam1")));
		    comboBox.selectByValue(tallaCam);
		    Select comboBox2 = new Select(driver.findElement(By.id("comboTallaPolo")));
		    comboBox.selectByValue(tallaPolo);
		    driver.findElement(By.id("txtnumCam1")).sendKeys(numCam);
		    Thread.sleep(500);
		    driver.findElement(By.id("txtnumPolo")).sendKeys(numPolos);
		    Thread.sleep(2000);
		    driver.findElement(By.id("btnConsulta")).click();
		    	    
		    Alert alert = driver.switchTo().alert();	
		    String textoAlerta = alert.getText();
		    alert.accept();
		    
		    
		    String producto1 = driver.findElement(By.id("pedidoprod1")).getText();
		    String producto2 = driver.findElement(By.id("pedidoprod2")).getText();
		    
		    System.out.println(producto1.substring(0,1));
		    
		    assertEquals(producto1.substring(0,1), numCam);
		    assertEquals(producto2.substring(0,1), numPolos);

		    
			} catch (Exception e) {
				
			} 
		}
	
		
	@Test
	void testUnicajaError() {
		  try {
		    WebDriver driver = new ChromeDriver();
		    driver.get("file:///C:/Users/alumnado/Downloads/ExUD3/web/index.html");
		
		    // Obtenemos la lista de enlaces y elegimos el de plantilla
		    List<WebElement> botones = (driver.findElements(By.tagName("a")));
		    botones.get(2).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("btnConsulta")).click();
		    	    
		    Alert alert = driver.switchTo().alert();	
		    String textoAlerta = alert.getText();
		    alert.accept();
		    
		    System.out.println(textoAlerta);	
		    
		    
			} catch (Exception e) {
				
			} 
		}
}
