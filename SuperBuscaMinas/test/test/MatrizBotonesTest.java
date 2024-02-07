package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pk_SuperBuscaMinas.BotonMina;
import pk_SuperBuscaMinas.BotonMina.Estado;
import pk_SuperBuscaMinas.BotonMina.Valor;
import pk_SuperBuscaMinas.Coordenadas;
import pk_SuperBuscaMinas.MatrizBotones;
import pk_SuperBuscaMinas.Util.Posicion;

public class MatrizBotonesTest {

  private Coordenadas coord = new Coordenadas(0, 0);

  static MatrizBotones matriz;

  @BeforeAll
  public static void texto() {
    System.out.println("*********** Inicio Prueba MatrizBotones ***********");
    matriz = new MatrizBotones(5, 5);
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
    matriz.actualizaNumMinasAdyacentes();
    matriz.imprimir();
  }

  @BeforeEach
  public void inicio() {
    // matriz 5x5
    matriz = new MatrizBotones(5, 5);
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
    matriz.actualizaNumMinasAdyacentes();

  }

  @AfterAll
  public static void fin() {
    System.out.println("Fin Prueba MatrizBotones");
  }

  @Test
  public void testHayBoton() {
    System.out.println("Método HayBoton");
    BotonMina boton1 = new BotonMina(0, 0);
    assertFalse(matriz.hayBoton(boton1, Posicion.SUP));
    assertFalse(matriz.hayBoton(boton1, Posicion.SUP_DER));
    assertTrue(matriz.hayBoton(boton1, Posicion.DER));
    assertTrue(matriz.hayBoton(boton1, Posicion.INF_DER));
    assertTrue(matriz.hayBoton(boton1, Posicion.INF));
    assertFalse(matriz.hayBoton(boton1, Posicion.INF_IZQ));
    assertFalse(matriz.hayBoton(boton1, Posicion.IZQ));
    assertFalse(matriz.hayBoton(boton1, Posicion.SUP_IZQ));
    System.out.println("Caso botón situado en la esquina superior izquierda");

    BotonMina boton2 = new BotonMina(0, 4);
    assertFalse(matriz.hayBoton(boton2, Posicion.SUP));
    assertFalse(matriz.hayBoton(boton2, Posicion.SUP_DER));
    assertFalse(matriz.hayBoton(boton2, Posicion.DER));
    assertFalse(matriz.hayBoton(boton2, Posicion.INF_DER));
    assertTrue(matriz.hayBoton(boton2, Posicion.INF));
    assertTrue(matriz.hayBoton(boton2, Posicion.INF_IZQ));
    assertTrue(matriz.hayBoton(boton2, Posicion.IZQ));
    assertFalse(matriz.hayBoton(boton2, Posicion.SUP_IZQ));
    System.out.println("Caso botón situado en la esquina superior derecha");

    BotonMina boton3 = new BotonMina(4, 4);
    assertTrue(matriz.hayBoton(boton3, Posicion.SUP));
    assertFalse(matriz.hayBoton(boton3, Posicion.SUP_DER));
    assertFalse(matriz.hayBoton(boton3, Posicion.DER));
    assertFalse(matriz.hayBoton(boton3, Posicion.INF_DER));
    assertFalse(matriz.hayBoton(boton3, Posicion.INF));
    assertFalse(matriz.hayBoton(boton3, Posicion.INF_IZQ));
    assertTrue(matriz.hayBoton(boton3, Posicion.IZQ));
    assertTrue(matriz.hayBoton(boton3, Posicion.SUP_IZQ));
    System.out.println("Caso botón situado en la esquina inferior derecha");

    BotonMina boton4 = new BotonMina(4, 0);
    assertTrue(matriz.hayBoton(boton4, Posicion.SUP));
    assertTrue(matriz.hayBoton(boton4, Posicion.SUP_DER));
    assertTrue(matriz.hayBoton(boton4, Posicion.DER));
    assertFalse(matriz.hayBoton(boton4, Posicion.INF_DER));
    assertFalse(matriz.hayBoton(boton4, Posicion.INF));
    assertFalse(matriz.hayBoton(boton4, Posicion.INF_IZQ));
    assertFalse(matriz.hayBoton(boton4, Posicion.IZQ));
    assertFalse(matriz.hayBoton(boton4, Posicion.SUP_IZQ));
    System.out.println("Caso botón situado en la esquina inferior izquierda");

    BotonMina boton5 = new BotonMina(2, 2);
    assertTrue(matriz.hayBoton(boton5, Posicion.SUP));
    assertTrue(matriz.hayBoton(boton5, Posicion.SUP_DER));
    assertTrue(matriz.hayBoton(boton5, Posicion.DER));
    assertTrue(matriz.hayBoton(boton5, Posicion.INF_DER));
    assertTrue(matriz.hayBoton(boton5, Posicion.INF));
    assertTrue(matriz.hayBoton(boton5, Posicion.INF_IZQ));
    assertTrue(matriz.hayBoton(boton5, Posicion.IZQ));
    assertTrue(matriz.hayBoton(boton5, Posicion.SUP_IZQ));
    System.out.println("Caso botón situado en centro");
  }

  @Test
  public void testMuestraMinas() {
    System.out.println("Método MuestraMinas");
    matriz.muestraMinas();
    assertEquals(matriz.getBoton(coord).getEstado(), Estado.MINA);
    matriz.imprimir();
  }

  @Test
  public void testRecursivoDestapaBotonesAdyacentes() {
    System.out.println();
    System.out.println("Metodo RecursivoDestapaBotonesAdyacentes");
    matriz.muestraMinas();
    // Prueba 1: Simulo el click en un botón con valor NUMERO (2, 0) por ejemplo,
    // por lo que no debería destapar adyacentes
    matriz.getBoton(2, 0).cambiarAspecto(Estado.NUMERO);
    matriz.recursivoDestapaBotonesAdyacentes(matriz.getBoton(2, 0));
    // Prueba 2: Simulo el click en un botón con valor VACIO (3,3) por ejemplo, por
    // lo que debe destapar
    matriz.getBoton(3, 3).cambiarAspecto(Estado.PULSADO);
    matriz.recursivoDestapaBotonesAdyacentes(matriz.getBoton(3, 3));

    matriz.actualizaNumMinasAdyacentes();
    matriz.imprimir();

  }

}
