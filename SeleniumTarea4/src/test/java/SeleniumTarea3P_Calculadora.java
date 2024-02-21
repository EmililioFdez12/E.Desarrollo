import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTarea3P_Calculadora {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @Test
  void testSumaNormal() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "2.5";
    String numero2 = "4";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();
      Thread.sleep(1000);
      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 6.5;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testRestaNormal() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "12.5";
    String numero2 = "20";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(1);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();
      Thread.sleep(1000);
      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = -7.5;

      assertEquals(esperado, resultadoOperacion);
      Thread.sleep(2000);
      driver.quit();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testMultiplicacion() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "3.5";
    String numero2 = "7";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(2);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();

      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 24.5;
      assertEquals(esperado, resultadoOperacion);
      Thread.sleep(2000);
      driver.quit();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testMultiplicacionInt() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "3.5";
    String numero2 = "7";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(2);
      Thread.sleep(2000);
      driver.findElement(By.id("integerSelect")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();
      Thread.sleep(1000);
      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 25;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testDivision() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "2.215";
    String numero2 = "7";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(3);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();

      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 0.3164285714285714;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testDivision2() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "-55";
    String numero2 = "3.5";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(3);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();

      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = -13.75;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testConcatenacion() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "3.14";
    String numero2 = "159265";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(4);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();

      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 3.149265;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

  @Test
  void testConcatenacion2() {
    WebDriver driver = new ChromeDriver();

    String numero1 = "3.14";
    String numero2 = "2.17";

    try {
      driver.get("https://testsheepnz.github.io/BasicCalculator.html");
      // Boton Pagina principal
      driver.findElement(By.id("number1Field")).sendKeys(numero1);
      Thread.sleep(1000);
      driver.findElement(By.id("number2Field")).sendKeys(numero2);
      Thread.sleep(1000);
      Select comboBoxOperaciones = new Select(driver.findElement(By.id("selectOperationDropdown")));
      comboBoxOperaciones.selectByIndex(4);
      Thread.sleep(1000);
      driver.findElement(By.id("calculateButton")).click();

      WebElement resultado = driver.findElement(By.id("numberAnswerField"));
      double resultadoOperacion = Integer.parseInt(resultado.getAttribute("value"));
      double esperado = 0;
      assertEquals(esperado, resultadoOperacion);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      driver.quit();
    }
  }

}