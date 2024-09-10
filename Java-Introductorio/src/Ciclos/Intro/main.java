package Ciclos.Intro;

public class main {
    public static void main(String []args){


            //Tipos de ciclos

        //WHILE
            int v=10;
        while(v>=1){
            System.out.println(v);
            v--;
        }

        //DO WHILE
        //ESTE CICLO SIEMPRE ENTRA UNA VEZ Y LUEGO PREGUNTA LA CONDICION
        do{
            System.out.println("prueba");
        }while (v>10);

        //FOR Y DE LOS MAS COMUNES
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
