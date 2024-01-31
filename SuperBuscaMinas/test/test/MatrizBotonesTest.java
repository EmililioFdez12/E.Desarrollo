package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import pk_SuperBuscaMinas.BotonMina;
import pk_SuperBuscaMinas.BotonMina.Valor;
import pk_SuperBuscaMinas.Coordenadas;
import pk_SuperBuscaMinas.MatrizBotones;
import pk_SuperBuscaMinas.Util.Posicion;

public class MatrizBotonesTest {

  static MatrizBotones matriz;

  @BeforeAll
  public static void inicio() {
    // matriz 5x5
    matriz = new MatrizBotones(5, 5);

    System.out.println("*********** Inicio Prueba MatrizBotones ***********");
    // Ponemos las minas
    matriz.getBoton(0, 0).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(0, 0));
   

    matriz.getBoton(0, 1).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(0, 1));

    matriz.getBoton(0, 2).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(0, 2));

    matriz.getBoton(1, 0).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(1, 0));

    matriz.getBoton(4, 0).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(4, 0));

    matriz.getBoton(4, 1).setValor(Valor.MINA);
    matriz.getListaPosicionMinas().add(new Coordenadas(4, 1));
    System.out.println("Matriz de prueba 5x5 con 6 minas");

    matriz.imprimir();

  }
  
  @AfterAll
  public static void fin() {
    System.out.println("Fin Prueba MatrizBotones");
  }


  @ParameterizedTest
  @CsvSource({
    "0,0",
    "5,5",
    "1,5",
    "5,1",
    "3,3",
  })
    void testHayBoton(int x, int y) {
    BotonMina boton = new BotonMina(x,y);
    assertTrue(matriz.hayBoton(boton, Posicion.DER));
    assertTrue(matriz.hayBoton(boton, Posicion.INF));
    assertTrue(matriz.hayBoton(boton, Posicion.INF_DER));
    assertFalse(matriz.hayBoton(boton, Posicion.INF_IZQ));
    assertFalse(matriz.hayBoton(boton, Posicion.IZQ));
    assertFalse(matriz.hayBoton(boton, Posicion.SUP_IZQ));
    assertFalse(matriz.hayBoton(boton, Posicion.SUP));
    assertFalse(matriz.hayBoton(boton, Posicion.SUP_DER));
    System.out.println("Caso botón situado en la esquina superior izquierda");
    System.out.println("Caso botón situado en la esquina inferior derecha");
    System.out.println("Caso botón situado en la esquina superior derecha");
    System.out.println("Caso botón situado en la esquina inferior izquierda");
    System.out.println("Caso botón situado en el centro");
     
  }

}
