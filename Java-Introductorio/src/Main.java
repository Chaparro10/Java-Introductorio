public class Main {
    public static void main(String[] args) {
    System.out.println("Hello world!");

        Persona p1 = new Persona(21,"Kmc");

        p1.Imprimir();

        int [] array = new int []{1,5,6,8,9,10};

        int valor=MaximoArray(array);

        System.out.println("El valor maximo es el:"+valor);

        String cadena="Hola";
        CadenaInvertida(cadena);

    }

    public static int MaximoArray(int [] array ){
        int valorMax=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>valorMax){
                valorMax =array[i];
            }
        }

        return valorMax;
    }

    public static void CadenaInvertida(String cadena){
       String CadenaInver="";
            int longitud=cadena.length()-1;
       for(int i=longitud;i >=0;i--){
            CadenaInver += cadena.charAt(i);
       }
        System.out.println("Cadena Invertida es :"+CadenaInver);
    }
}