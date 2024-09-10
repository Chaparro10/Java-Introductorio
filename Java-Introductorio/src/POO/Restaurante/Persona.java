package POO.Restaurante;

abstract class Persona {


    private  String Nombre;
    private String Id;

    public Persona(String nombre , String id){
        this.Nombre=nombre;
        this.Id=id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getId() {
        return Id;
    }

    public abstract  void MostrarInfo();

}
