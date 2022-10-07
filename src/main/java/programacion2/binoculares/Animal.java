public class Animal extends Objetivo {
  private int cantidadPatas;
  private String tipoAlimentacion;

  public Animal(
      String p_nombre,
      String p_nombreCientifico,
      int p_rareza,
      int p_cantidadPatas,
      String p_tipoAlimentacion) {
    super(p_nombre, p_nombreCientifico, p_rareza, "animal");
    this.cantidadPatas = p_cantidadPatas;
    this.tipoAlimentacion = p_tipoAlimentacion;
  }

  @Override
  public String toString() {
    return "Este es un animal";
  }

  @Override
  public String reaccion() {
    return "Te mordió, ¡corré papanatas! Te persigue un " + this.nombre;
  }

  @Override
  public String getData() {
    return "- Tipo de alimentación: " + this.tipoAlimentacion + "\n- Cantidad de patas: " + this.cantidadPatas + "\n";
  }
}