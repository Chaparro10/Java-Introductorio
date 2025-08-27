package platzi.play.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);
    public static String capturarTexto(String texto){
        System.out.println(texto +": ");
        return  scanner.next();
    }
    public static int capturarNumero(int numero){
        System.out.println(numero +": ");
        return  scanner.nextInt();
    }
    public static double capturarDecimal(String numero){
        System.out.println(numero +": ");
        return  scanner.nextDouble();
    }

}
