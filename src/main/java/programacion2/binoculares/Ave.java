public class Ave extends Objetivo {
  public Ave(
      String p_nombre,
      String p_nombreCientifico,
      int p_rareza) {
    super(p_nombre, p_nombreCientifico, p_rareza, "ave");
  }

  @Override
  public String toString() {
    return "Este es un ave";
  }

  @Override
  public String reaccion() {
    return "Te mordió, ¡corré papanatas! Te persigue un " + this.nombre;
  }

  @Override
  public String getData() {
    return "";
  }
}