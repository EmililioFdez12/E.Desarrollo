package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import pk_SuperBuscaMinas.BotonMina;
import pk_SuperBuscaMinas.BotonMina.Estado;

public class BotonMinaTest {

  @BeforeAll
  public static void inicio() {
    System.out.println("***************** Inicio pruebas BotonMina *******************");
  }

  @AfterAll
  public static void fin() {
    System.out.println("***************** Fin pruebas BotonMina *******************");
  }

  @ParameterizedTest
  @CsvSource({ "BANDERA", "BOTON", "PULSADO", "MINA", "NUMERO", })
  void cambiarAspecto(Estado estado1) {
    BotonMina boton = new BotonMina();
    System.out.println("Boton Inicial:       [Val = " + boton.getValor().toString() + " , Est= " + boton.getEstado().toString() + "]");
    System.out.println("Nuevo estado:        " + estado1);
    boton.cambiarAspecto(estado1);
    System.out.println("Boton Inicial:       [Val = " + boton.getValor().toString() + " , Est= " + boton.getEstado().toString() + "]");
    System.out.println();

  }
  
  
  

}