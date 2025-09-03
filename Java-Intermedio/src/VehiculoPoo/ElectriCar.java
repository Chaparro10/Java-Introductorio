package VehiculoPoo;

public class ElectriCar extends  Vehicle implements  Electric{

    private  CarType type;
    private int batteryLevel;
    public ElectriCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year);
        this.type = type;
        this.batteryLevel=batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("Carro electrico iniciado");
    }


    @Override
    public String toString() {
        return super.toString() +" tipo electrico::: "+ type;
}

    @Override
    public void chargedBatery() {
        batteryLevel=100;
        System.out.println("Bateria al 100%");
    }
}
