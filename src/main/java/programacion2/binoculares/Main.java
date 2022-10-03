import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.print("\033[H\033[2J------------------------\n");
    // printString(
    // "¡Hola! Bienvenido al simulador para observar la naturaleza.\n\nEstás en los
    // cerros tucumanos, más específicamente en San Javier. La Sierra San Javier se
    // ubica al oeste de la ciudad de San Miguel de Tucumán, entre los 26°38' y los
    // 26°5' de latitud sur, y los 65°06' y 65°20' de longitud oeste.\n\n¡Esperamos
    // que lo disfrutes!\n\nPara proceder, por favor ingresa el modelo de los
    // binoculares que quieras utilizar: ");
    // String modelo = scanner.nextLine();

    // printString("\n¡Excelente elección! Ahora por favor ingresa la distancia
    // focal de tus binoculares: ");
    // double distancia = scanner.nextDouble();

    // printString("\nPor último, por favor ingresa la apertura de tus binoculares:
    // ");
    // double apertura = scanner.nextDouble();

    // Binocular binocular = new Binocular(modelo, distancia, apertura);
    Binocular binocular = new Binocular("modelo", 1, 1);
    Simulador simulador = new Simulador(binocular);

    // printList(String.format(
    // "\nLas características de tus binoculares son:\n- Modelo: %s\n- Distancia
    // focal: %.2f\n- Apertura: %.2f\n",
    // binocular.getModelo(), binocular.getDistanciaFocal(),
    // binocular.getApertura()));

    // printString("\nParece estar todo listo.\n¡Comencemos a explorar!\n\nPresiona
    // enter para continuar ");
    // try {
    // System.in.read();
    // } catch (IOException e) {
    // System.out.print("error");
    // }

    System.out.print("\033[H\033[2J------------------------\n");
    printString("Estas parado sobre un estratégico lugar para observar la naturaleza.\n");
    boolean isPlaying = true;
    ArrayList<Integer> last_dirs = new ArrayList<Integer>();
    Integer code[] = { 1, 2, 3, 4 };

    while (isPlaying) {
      if (last_dirs.size() == 4) {
        last_dirs.remove(0);
      }

      printList(
          "Elige el lugar hacia donde quieras mirar:\n1. Arriba\n2. Abajo\n3. Izquierda\n4. Derecha\n-");

      int dir = scanner.nextInt();
      switch (dir) {
        case 1:
          simulador.setDireccion("arriba");
          last_dirs.add(dir);
          break;
        case 2:
          simulador.setDireccion("abajo");
          last_dirs.add(dir);
          break;
        case 3:
          simulador.setDireccion("izquierda");
          last_dirs.add(dir);
          break;
        case 4:
          simulador.setDireccion("derecha");
          last_dirs.add(dir);
          break;
        default:
          printString("\nPor favor ingrese una opción válida.\nPresione enter para continuar ");
          try {
            System.in.read();
          } catch (IOException e) {
            System.out.print("error");
          }
          System.out.print("\033[H\033[2J------------------------\n");
          continue;
      }

      if (Arrays.equals(last_dirs.toArray(), code)) {
        System.out.print("\033[H\033[2J------------------------\n");
        printSuspense("...\n...\n...\n");
        printString(
            "\nHa ocurrido un problema.\nEstabas tan distraído disfrutando el paisaje que te han robado los binoculares y todas tus otras pertenencias.\n\nHora de ir a la comisaría.\nGracias por usar el simulador.");
        isPlaying = false;
        break;
      }

      String dirStr = simulador.getDireccion();
      printString("\nLa dirección actual es: " + dirStr.substring(0, 1).toUpperCase() + dirStr.substring(1));

      Objetivo obj = simulador.observar();
      printString("\n¡Encontraste un " + obj.getNombre() + "!\n");

      printList("- Nombre científico: " + obj.getNombreCientifico() + "\n" + obj.getData() + "- Rareza: " + obj.getRareza() + "\n");
      printString("\nPresiona enter para continuar o presiona cualquier tecla para salir ");
      int key = 10;
      try {
        key = System.in.read();
      } catch (IOException e) {
        System.out.print("error");
      }
      if (key == 10) {
        System.out.print("\033[H\033[2J------------------------\n");
      } else {
        simulador.mostrarDiario();
        System.out.print("------------------------\n");
        printString("Gracias por usar el simulador.\n¡Hasta la próxima!\n");
        isPlaying = false;
      }
    }
  }

  public static void printString(String a) {
    for (int i = 0; i < a.length(); i++) {
      System.out.print(a.charAt(i));
      if (a.charAt(i) == '.' || a.charAt(i) == '!') {
        try {
          Thread.sleep(600);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      } else {
        try {
          Thread.sleep(30);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      }
    }
  }

  public static void printList(String a) {
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '\n') {
        try {
          Thread.sleep(600);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      } else {
        try {
          Thread.sleep(30);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      }
      System.out.print(a.charAt(i));
    }
  }

  public static void printSuspense(String a) {
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '\n' || a.charAt(i) == '.') {
        try {
          Thread.sleep(600);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      } else {
        try {
          Thread.sleep(30);
        } catch (InterruptedException e) {
          System.out.print("error");
        }
      }
      System.out.print(a.charAt(i));
    }
  }
}