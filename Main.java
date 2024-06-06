import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int option;
        System.out.println("\n----Guia Semana 12----");
        do {
            System.out.println("·······································································");
            System.out.println("                                 Menu                                  ");
            System.out.println("                                                                       ");
            System.out.println("1. Que es un ArrayList"                                                 );
            System.out.println("2. Diferencias entre ArrayList, Arreglo o Vector"                       );
            System.out.println("3. Métodos de la clase ArrayList en Java"                               );
            System.out.println("4. Conclusiones sobre el uso de ArrayList"                              );
            System.out.println("5. Submenu de operaciones"                                              );
            System.out.println("6. Salir"                                                               );
            System.out.println("                                                                       ");
            System.out.println("·······································································");
            System.out.print("Elija opción: \n");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    mostrarDefinicionArrayList();
                    break;
                case 2:
                    mostrarDiferencias();
                    break;
                case 3:
                    mostrarMetodos();
                    break;
                case 4:
                    mostrarConclusiones();
                    break;
                case 5:
                    subMenu(arrayList);
                    break;
                case 6:
                    System.out.println("Adioss");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opción valida (1-6).");
            }
        } while (option != 6);

        scanner.close();
    }

    static void mostrarDefinicionArrayList() {
        System.out.println("Definicion de un ArrayList:\n");
        System.out.println("La clase ArrayList en Java es una clase que permite almacenar datos en memoria de forma similar a los Arrays, con la ventaja de que el número de elementos que almacena es dinamico, es decir, no es necesario declarar su tamaño como pasa con los Arrays. Por lo tanto, el ArrayList es una estructura más compleja que el Array, pero a su vez mucho más potente ya que nos permite un número ilimitado de elementos sin importarnos errores tipo 'IndexOutOfBoundsException'.\nFuente: https://luismoralescotoli.wordpress.com/");
    }

    static void mostrarDiferencias() {
        System.out.println("Diferencias entre ArrayList , Arreglo o Vector:\n");
        System.out.println("1. Un ArrayList en Java puede cambiar su tamaño dinámicamente, mientras que un arreglo tiene un tamaño fijo una vez creado.\n" +
                "2. Los ArrayList permiten almacenar elementos de cualquier tipo, mientras que los arreglos en Java están limitados a un solo tipo de dato.\n" +
                "3. Los ArrayList proporcionan métodos útiles para agregar, eliminar y buscar elementos de manera eficiente, lo cual es más complicado con los arreglos.\n" +
                "4. Los ArrayList tienen la capacidad de redimensionarse automáticamente según la cantidad de elementos que contienen, mientras que los arreglos no.\n" +
                "5. Los ArrayList pueden contener elementos nulos, mientras que los arreglos no pueden almacenar valores nulos directamente.\n" +
                "6. Los ArrayList son clases, mientras que los arreglos son tipos de datos.");
        System.out.println("\nFuente: https://es.stackoverflow.com/");
    }

    static void mostrarMetodos() {
        System.out.println("Métodos de la clase ArrayList en Java:");
        System.out.println("1. add(E elemento): Agrega un elemento al final de la lista.");
        System.out.println("2. remove(int índice): Elimina el elemento en el índice especificado.");
        System.out.println("3. get(int índice): Obtiene el elemento en el índice especificado.");
        System.out.println("4. size(): Devuelve el número de elementos en la lista.");
        System.out.println("Fuente: https://www.ionos.com");
    }

    static void mostrarConclusiones() {
        System.out.println("Algunas conclusiones sobre ArrayList:");
        System.out.println("- Con el ArrayList, añadir, quitar, buscar o cambiar elementos es muy sencillo ya que hay métodos específicos para cada tarea");
        System.out.println("- Util para situaciones donde no sabes la cantidad exacta de elementos que va a tener una lista");
    }

    static void subMenu(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("·······································································");
            System.out.println("                        Submenu de Operaciones                         ");
            System.out.println("1. Agregar un elemento al ArrayList"                                    );
            System.out.println("2. Eliminar un elemento del ArrayList"                                  );
            System.out.println("3. Buscar un elemento en el ArrayList"                                  );
            System.out.println("4. Mostrar el contenido del ArrayList"                                  );
            System.out.println("5. Volver al menú principal"                                            );
            System.out.print("Elija una opción: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agregarElemento(arrayList);
                    break;
                case 2:
                    eliminarElemento(arrayList);
                    break;
                case 3:
                    buscarElemento(arrayList);
                    break;
                case 4:
                    mostrarContenido(arrayList);
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal.");
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida (1-5).");
            }
        } while (option != 5);

    }

    static void agregarElemento(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a agregar: ");
        String elementoAgregar = scanner.nextLine();
        arrayList.add(elementoAgregar);
        System.out.println("Elemento agregado correctamente.");
    }

    static void eliminarElemento(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);
        if (!arrayList.isEmpty()) {
            System.out.print("Ingrese el indice del elemento a eliminar: ");
            int indiceEliminar = scanner.nextInt();
            scanner.nextLine();
            if (indiceEliminar >= 0 && indiceEliminar < arrayList.size()) {
                String elementoEliminado = arrayList.remove(indiceEliminar);
                System.out.println("Elemento '" + elementoEliminado + "' eliminado correctamente.");
            } else {
                System.out.println("Indice fuera de rango.");
            }
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }

    static void buscarElemento(ArrayList<String> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento a buscar: ");
        String elementoBuscar = scanner.nextLine();
        int indice = arrayList.indexOf(elementoBuscar);
        if (indice != -1) {
            System.out.println("El elemento '" + elementoBuscar + "' se encuentra en el índice " + indice + ".");
        } else {
            System.out.println("El elemento no se encuentra en el ArrayList.");
        }
    }

    static void mostrarContenido(ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            System.out.println("Contenido del ArrayList:");
            for (String elemento : arrayList) {
                System.out.println(elemento);
            }
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}
