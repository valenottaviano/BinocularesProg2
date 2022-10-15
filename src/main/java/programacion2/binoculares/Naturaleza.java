import java.util.ArrayList;
import java.util.Random;

public class Naturaleza {
  ArrayList<Objetivo> database_animales;
  ArrayList<Objetivo> database_plantas;
  ArrayList<Objetivo> database_peces;
  ArrayList<Objetivo> database_aves;

  public Naturaleza() {
    database_animales = new ArrayList<Objetivo>();
    database_plantas = new ArrayList<Objetivo>();
    database_peces = new ArrayList<Objetivo>();
    database_aves = new ArrayList<Objetivo>();
    database_animales.add(new Animal("Perro", "SebastianBrito", 10, 2, "Peligroso"));
    database_plantas.add(new Planta("Jazmín", "ValentinOttaviano", 5, "Verde", true));
    database_peces.add(new Pez("Pejerrey", "maximiliano", 0, 10));
    database_aves.add(new Ave("Águila", "maximiliano", 0));
  }

  public Objetivo getObjetivo(String dir) {
      
    Random rand = new Random();
    int index;

    switch (dir) {
      case "izquierda":
        index = rand.nextInt(database_animales.size());
        return database_animales.get(index);
      case "derecha":
        index = rand.nextInt(database_plantas.size());
        return database_plantas.get(index);
      case "abajo":
        index = rand.nextInt(database_peces.size());
        return database_peces.get(index);
      case "arriba":
        index = rand.nextInt(database_aves.size());
        return database_aves.get(index);
      default:
        index = rand.nextInt(database_animales.size());
        return database_animales.get(index);
    }
  }

}