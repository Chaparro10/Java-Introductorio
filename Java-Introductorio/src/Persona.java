public class Persona {

    private int edad;
    private String nombre;

    public Persona(int edadc, String nombrec){
            this.edad=edadc;
            this.nombre=nombrec;
    }

    public void Imprimir(){
        System.out.println("Los datos de la persona son:"+nombre+"-"+edad);
    }


}
