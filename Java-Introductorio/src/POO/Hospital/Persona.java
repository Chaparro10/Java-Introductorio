package POO.Hospital;

abstract class Persona {


    private  String Nombre;
    private String Id;

    private int Edad;

    public Persona(String nombre, String id, int edad) {
        this.Nombre = nombre;
        this.Id = id;
        this.Edad = edad;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getId() {
        return Id;
    }

    public int getEdad() {
        return Edad;
    }

    public abstract  void MostrarInfo();

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Id='" + Id + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}
