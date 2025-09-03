package VehiculoPoo;

public class MainVehicle {
    public static  void main(String []args){
        Vehicle myCar = new Car("Nissan","Z21",2000,CarType.SPORT);
        Vehicle myCar2= new ElectriCar("Byd","Byd21",2024,CarType.SEDAN,55);


        System.out.println("Mi carro 1:::"+myCar.toString());
        System.out.println("Mi carro 2::::"+myCar2.toString());
    }



}
