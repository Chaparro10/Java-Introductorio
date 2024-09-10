package MetodosOrdenamiento;

public class Inserccion {
    public static void main(String [] args){


        //Metodo de ordenamiento Inserccion ordenar array

        int []array = new int[]{1,5,8,7,6,2,4,8};//Definimos el array estatico


        int pos;
        int aux;
        for(int i=0;i<8;i++){
            pos=i;

            System.out.println(pos);
            aux=array[i];

            while((pos>0) && array[pos-1]>aux){
                    array[pos]=array[pos-1];
                    pos--;

            }
            array[pos]=aux;

        }


        for (int v:array
        ) {
            System.out.println("Array Ordenado"+v);
        }
    }
}
