package refactoring;

import java.util.ArrayList;

public class Cliente {

  private String nombre;
  private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

  public Cliente(String nombre) {
    this.nombre = nombre;
  }

  public void addAlquiler(Alquiler arg) {
    alquileres.add(arg);
  }

  public String getNombre() {
    return nombre;
  }

  // Método para calcular la cuenta y devolverla en formato de texto
  public String cuenta() {
    double precioTotal = 0;
    int puntosFrecuenciaAlquiler = 0;
    String resultado = "Registro de alquiler para " + getNombre() + "\n";

    for (Alquiler alquiler : alquileres) {
      double thisTotal = alquiler.calcularImporte();

      // añade puntos fidelización por alquiler
      puntosFrecuenciaAlquiler++;
      // añade bonus por un alquiler de una furgoneta de dos días
      if ((alquiler.getVehiculo().getCodigoPrecio() == Vehiculo.FURGONETA) && alquiler.getDiasAlquiler() > 2)
        puntosFrecuenciaAlquiler++;

      // datos alquiler
      resultado += "\t" + alquiler.getVehiculo().getMatricula() + "\t" + String.valueOf(thisTotal) + "\n";
      precioTotal += thisTotal;
    }

    resultado += "Importe total " + String.valueOf(precioTotal) + "\n";
    resultado += "Has ganado " + String.valueOf(puntosFrecuenciaAlquiler) + " puntos de fidelidad";
    
    return resultado;
  }

  // Método para calcular la cuenta y devolverla en formato HTML
  public String htmlCuenta() {
    String html = "<html><head><title>Registro de alquiler</title></head><body>";
    html += "<h1>Registro de alquiler para " + getNombre() + "</h1>";
    html += "<ul>";

    double precioTotal = 0;

    for (Alquiler alquiler : alquileres) {
      double thisTotal = alquiler.calcularImporte();
      html += "<li>" + alquiler.getVehiculo().getMatricula() + " - " + thisTotal + "</li>";
      precioTotal += thisTotal;
    }

    html += "</ul>";
    html += "<p>Importe total: " + precioTotal + "</p>";
    html += "<p>Has ganado " + puntosFrecuenciaAlquiler() + " puntos de fidelidad</p>";
    html += "</body></html>";

    return html;
  }

  // Método para calcular los puntos de fidelidad ganados por el cliente
  private int puntosFrecuenciaAlquiler() {
    int puntos = 0;

    for (Alquiler alquiler : alquileres) {
      puntos++;
      if ((alquiler.getVehiculo().getCodigoPrecio() == Vehiculo.FURGONETA) && alquiler.getDiasAlquiler() > 2)
        puntos++;
    }

    return puntos;
  }
}
