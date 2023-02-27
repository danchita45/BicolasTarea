package bicola;

import java.util.Scanner;

public class BiMenu {

    public static void main(String[] args) {
        Object[] T = new Object[5];
        Bicola bc = new Bicola(T);

        int opciones;
        do {
            opciones = menu();
            switch (opciones) {
                case 1:
                    Auto auto = new Auto();
                    auto = datosAuto();
                    bc.frente = bc.inserta(bc.frente, bc.atras1, auto, 1);
                    break;
                case 2:
                    Libro libro = new Libro();
                    libro = datosLibro();
                    bc.atras1 = bc.inserta(bc.atras1, bc.frente, libro, -1);
                    break;
                case 3:
                    bc.Elimina(bc.atras, bc.frente, 1);
                    break;
                case 4:
                for (Object T1 : T) {
                    System.out.println(T1);
                }
                    break;

                case 5:

                    break;

            }
        } while (opciones != 5);
    }

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("Ingresar autos por el lado derecho.");
        System.out.println("Ingresar libros por el lado izquierdo.");
        System.out.println("Mostrar elementos en la bicola");
        System.out.println("Eliminar elementos");
        System.out.println("Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }

    public static Libro datosLibro() {
        Libro libro = new Libro();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quien es el autor del libro?");
        libro.Autor = teclado.next();
        System.out.println("Cual es la editorial?");
        libro.Editorial = teclado.next();
        System.out.println("Cual es la fecha de publicacion?");
        libro.Year = teclado.nextInt();
        System.out.println("Que edicion es?");
        libro.Edicion = teclado.next();
        return libro;
    }

    public static Auto datosAuto() {
        Auto auto = new Auto();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quien es el autor del libro?");
        auto.Marca = teclado.next();
        System.out.println("Cual es la editorial?");
        auto.Tipo_Coche = teclado.next();
        System.out.println("Cual es la fecha de publicacion?");
        auto.Year = teclado.nextInt();
        return auto;
    }
}
