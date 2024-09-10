package MetodosOrdenamiento;

public class Burbuja {
    public static void main(String []args){


            //Metodo de ordenamiento burbuja ordenar array

        int []array = new int[]{1,5,8,7,6,2,4,8};//Definimos el array estatico


        int aux=0;
        for(int i=0;i<7;i++){//Recorrer cada elemento del array
            for(int j=0;j<7;j++){
                    if(array[j]>array[j+1]){
                        aux=array[j];
                        array[j]=array[j+1];
                        array[j+1]=aux;
                    }
            }

        }


        for (int v:array
             ) {
            System.out.println("Array Ordenado"+v);
        }


    }
}
