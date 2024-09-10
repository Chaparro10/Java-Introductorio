package POO.Biblioteca;

abstract class Persona {
        private String Nombre;
        private String id;

    public Persona(String nombre, String id) {
        Nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getId() {
        return id;
    }

    public abstract  void MostrarInfo();

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
