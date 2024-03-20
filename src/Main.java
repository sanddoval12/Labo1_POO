//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Instanciación de la clase Scanner


        System.out.println("Bienvenido a mi calculadora :)");
        System.out.print("Ingrese un numero: ");
        int x = sc.nextInt(); // Leyendo un entero
        System.out.print("Ingrese otro numero: ");
        int y = sc.nextInt(); // Leyendo un entero

        int opc = 0;

        do {

            System.out.printf("1. SUMAR %n2. RESTAR %n3. MULTIPLICAR %n4. DIVIDIR %n5. SALIR %n");
            System.out.print("OPCION: ");
            opc = sc.nextInt(); // Leyendo un entero

            switch (opc) {
                case 1:
                    System.out.println("La suma es: " + suma(x, y));
                    break;
                case 2:
                    System.out.println("La resta es: " + resta(x, y));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + multiplicacion(x, y));
                    break;
                case 4:
                    System.out.println("La division es: " + dividir(x, y));
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR :c");
                    break;
            }

        }while(opc != 5);
    }
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static float dividir(int a, int b) {
        if (b == 0){
            System.out.println("No se puede dividir entre 0");
        }
        return a/b;
        }
}