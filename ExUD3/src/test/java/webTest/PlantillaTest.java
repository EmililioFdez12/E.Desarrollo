package webTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Driver;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlantillaTest {

//	@ParameterizedTest
//	@CsvSource({
//		
//	})
	@ParameterizedTest
	@CsvSource({
		"alberto,file:///C:/Users/alumnado/Downloads/ExUD3/web/imagenes/alberto.jpg,Alberto Díaz",
		"ejim,file:///C:/Users/alumnado/Downloads/ExUD3/web/imagenes/ejim.jpg,Melvin Ejim",
		"kalinoski,file:///C:/Users/alumnado/Downloads/ExUD3/web/imagenes/kalinoski.jpg,Tyler Kalinoski",
	})
	void testUnicajaSelenium(String idJugador, String imagen, String nombre) {
	  try {
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///C:/Users/alumnado/Downloads/ExUD3/web/index.html");
	
	    // Obtenemos la lista de enlaces y elegimos el de plantilla
	    List<WebElement> botones = (driver.findElements(By.tagName("a")));
	    botones.get(1).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id(idJugador)).click();
	    
	    // Recojo el nombre y la foto del jugador seleccionado
	    String hayFoto = driver.findElement(By.id("imagenDestacada")).getAttribute("src").toString();  
	    String nombreJugador = driver.findElement(By.id("lblNombreJugador")).getText();

	  
	    assertEquals(hayFoto, imagen);
	    assertEquals(nombreJugador, nombre);	  	 	    
	
		} catch (Exception e) {
			
		} finally {
			
		}
	}
	
}
