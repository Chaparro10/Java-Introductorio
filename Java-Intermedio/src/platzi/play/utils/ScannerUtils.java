package platzi.play.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);
    public static String capturarTexto(String texto){
        System.out.println(texto +": ");
        return  scanner.next();
    }
    public static int capturarNumero(String numero){
        System.out.println(numero +": ");

        if(!scanner.hasNextInt()){
            System.out.println("Dato no valido "+ numero);
            scanner.nextLine();
        }
        return  scanner.nextInt();
    }
    public static double capturarDecimal(String numero){
        System.out.println(numero +": ");
        return  scanner.nextDouble();
    }

}
