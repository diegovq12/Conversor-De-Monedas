import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        OperacionesDivisas conversion = new OperacionesDivisas();
        float cantidad;

        Integer opcion;
        do {
            menu.mostrarMenu();
            opcion = Integer.valueOf(sc.nextLine());

            cantidad = menu.obtenerCantidad();

            switch (opcion) {
                case 1:
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversion.CalcularConversion("USD", "ARS", cantidad) + " [ARS]");
                    break;
                case 2:
                    System.out.println("El valor de " + cantidad + " [ARS] corresponde al valor final de =>> " + conversion.CalcularConversion("ARS", "USD", cantidad) + " [USD]");
                    break;
                case 3:
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversion.CalcularConversion("USD", "BRL", cantidad) + " [BRL]");
                    break;
                case 4:
                    System.out.println("El valor de " + cantidad + " [BRL] corresponde al valor final de =>> " + conversion.CalcularConversion("BRL", "USD", cantidad) + " [USD]");
                    break;
                case 5:
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversion.CalcularConversion("USD", "CLP", cantidad) + " [CLP]");
                    break;
                case 6:
                    System.out.println("El valor de " + cantidad + " [CLP] corresponde al valor final de =>> " + conversion.CalcularConversion("CLP", "USD", cantidad) + " [USD]");
                    break;
                case 7:
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversion.CalcularConversion("USD", "MXN", cantidad) + " [MXN]");
                    break;
                case 8:
                    System.out.println("El valor de " + cantidad + " [MXN] corresponde al valor final de =>> " + conversion.CalcularConversion("MXN", "USD", cantidad) + " [USD]");
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        } while (opcion != 9);
    }



}
