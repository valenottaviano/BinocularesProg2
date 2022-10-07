public class Planta extends Objetivo {
  private String color;
  private boolean tieneFlor;

  public Planta(
      String p_nombre,
      String p_nombreCientifico,
      int p_rareza,
      String p_color,
      boolean p_tieneFlor) {
    super(p_nombre, p_nombreCientifico, p_rareza, "planta");
    this.color = p_color;
    this.tieneFlor = p_tieneFlor;
  }

  @Override
  public String toString() {
    return "Esto es una planta";
  }

  @Override
  public String reaccion() {
    return "Te envenenaron. Succiona el veneno de la herida o morirás. Te envenenó un " + this.nombre;
  }

  @Override
  public String getData() {
    String flor = "No";
    if(this.tieneFlor) flor = "Si";
    return "- Color: " + this.color + "\n- ¿Tiene flor?: " + flor + "\n";
  }
}