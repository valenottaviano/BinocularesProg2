public abstract class Objetivo {
  protected String nombre;
  protected String nombreCientifico;
  protected int rareza; // Rareza 0-10
  protected String tipo;

  public Objetivo(String p_nombre, String p_nombreCientifico, int p_rareza, String p_tipo) {
    this.nombre = p_nombre;
    this.nombreCientifico = p_nombreCientifico;
    this.rareza = p_rareza;
    this.tipo = p_tipo;
  }

  public abstract String toString();

  public abstract String reaccion();

  public abstract String getData();

  public String getNombre() {
    return this.nombre;
  }

  public String getNombreCientifico() {
    return this.nombreCientifico;
  }

  public int getRareza() {
    return this.rareza;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  public void setNombreCientifico(String p_nombreCientifico) {
    this.nombreCientifico = p_nombreCientifico;
  }

  public void setRareza(int p_rareza) {
    this.rareza = p_rareza;
  }

}