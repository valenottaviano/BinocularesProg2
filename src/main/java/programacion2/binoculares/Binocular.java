public class Binocular {
  private String modelo;
  private double distanciaFocal; 
  private double apertura;

  public Binocular(String p_modelo, double p_distanciaFocal, double p_apertura){
    this.modelo = p_modelo;
    this.distanciaFocal = p_distanciaFocal;
    this.apertura = p_apertura;
  }

  public String getModelo() {
    return this.modelo;
  }

  public double getDistanciaFocal() {
    return this.distanciaFocal;
  }

  public double getApertura() {
    return this.apertura;
  }

  public void setModelo(String p_modelo) {
    this.modelo = p_modelo;
  }

  public void setDistanciaFocal(double p_distancia) {
    this.distanciaFocal = p_distancia;
  }

  public void setApertura(double p_apertura) {
    this.apertura = p_apertura;
  }
} 