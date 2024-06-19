import java.util.Scanner;

public class Menu {

    public void mostrarMenu(){
        System.out.println("**************************************************************");
        System.out.println("Bienvenid@ al Conversor de Moneda =)");
        System.out.println("1) Dolar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dolar");
        System.out.println("3) Dolar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dolar");
        System.out.println("5) Dolar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dolar");
        System.out.println("7) Dolar =>> Peso Mexicano ");
        System.out.println("8) Peso Mexicano =>> Dolar");
        System.out.println("9) Salir");
        System.out.println("Seleccione una opcion: ");
        System.out.println("***************************************************************");
    }

    public float obtenerCantidad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad a convertir: ");
        return entrada.nextFloat();
    }
}
