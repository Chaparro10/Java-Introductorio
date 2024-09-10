package POO.Restaurante;

public class Cliente  extends  Persona{

    public Cliente(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Cliente: "+ getNombre() +" , ID:"+getId());
    }
}
