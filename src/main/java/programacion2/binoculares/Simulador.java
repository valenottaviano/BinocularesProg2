import java.util.ArrayList;

public class Simulador {
  ArrayList<Objetivo> diario;
  ArrayList<Objetivo> objetivos;
  Naturaleza naturaleza;
  Binocular binocular;
  String direccion;

  public Simulador(Binocular p_binocular) {
    this.binocular = p_binocular;
    this.direccion = "centro";
    diario = new ArrayList();
    objetivos = new ArrayList();
    naturaleza = new Naturaleza();
  }

  public Objetivo observar() {
    Objetivo obj = naturaleza.getObjetivo(this.direccion);
    diario.add(obj);
    return obj;
  }

  public void mostrarDiario() {
    System.out.print("\033[H\033[2J------------------------\n");
    System.out.println("DIARIO DE OBSERVACIONES:");
    for (int x = 0; x < diario.size(); x++) {
      Objetivo obj = diario.get(x);
      System.out.println("- " + obj.getNombre());
    }
  }

  public Binocular getBinocular() {
    return this.binocular;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public ArrayList<Objetivo> getDiario() {
    return this.diario;
  }

  public void setBinocular(Binocular p_binocular) {
    this.binocular = p_binocular;
  }

  public void setDireccion(String p_direccion) {
    this.direccion = p_direccion;
  }
}