package refactoring;

public class Alquiler {

  private Vehiculo vehiculo;
  private int diasAlquiler;

  public Alquiler(Vehiculo vehiculo, int diasAlquiler) {
    this.vehiculo = vehiculo;
    this.diasAlquiler = diasAlquiler;
  }
  

  public int getDiasAlquiler() {
    return diasAlquiler;
  }
  

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  // Método para calcular el importe del alquiler
  public double calcularImporte() {
      double importe = 0;

      switch (vehiculo.getCodigoPrecio()) {
          case Vehiculo.TURISMO:
              importe += 20;
              if (diasAlquiler > 10) {
                  importe += (diasAlquiler - 10) * 7.5;
              }
          case Vehiculo.FURGONETA:
              importe += diasAlquiler * 30;
          case Vehiculo.MOTOCICLETA:
              importe += 10;
              if (diasAlquiler > 5) {
                  importe += (diasAlquiler - 5) * 7.5;
              }
      }

      return importe;
  }
}
