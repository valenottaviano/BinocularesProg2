import java.util.ArrayList;

public class Pez extends Objetivo {
  private double peso;

  public Pez(
      String p_nombre,
      String p_nombreCientifico,
      int p_rareza,
      double p_peso) {
    super(p_nombre, p_nombreCientifico, p_rareza, "pez");
    this.peso = p_peso;
    
    ArrayList peces = new ArrayList();
    peces.add("Pejerrey");
    peces.add("Trucha");
    peces.add("Sabalo");
    peces.add("Bagre");
    peces.add("Dorado");
    
  }

  @Override
  public String toString() {
    return "Este es un pez!";
  }

  @Override
  public String reaccion() {
    return "Te mordió, ¡corré papanatas! Te persigue un " + this.nombre;
  }

  @Override
  public String getData() {
    return "- Peso: " + this.peso + "\n";
  }
}