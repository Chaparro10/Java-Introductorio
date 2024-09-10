package Archivos.CrearArchivo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static  void main(String []args){


        CrearArchivo();
    }

    public static void CrearArchivo(){
        File archivo=new File("PruebaJava.txt");

        try{
                if(archivo.createNewFile()){
                    System.out.println("Archivo creado correctamente");
                }
        }catch (IOException ex){
            System.out.println("Error al generarl el archivo"+ex);
        }
    }
}
