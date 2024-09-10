package Operadores.SalarioMensualVendedor;

public class Venta {

    private String Nombre;
    private int Vendido;

    private final double comision=0.05;
    private final int Bono=150;


    public Venta(String nombre , int venta){
            this.Nombre=nombre;
            this.Vendido=venta;
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }



    public double SalarioTotal(){
            double salario=1000;
            double salarioTotal=0;

            salarioTotal =(Vendido * comision) + (Vendido*Bono) +salario;
        return salarioTotal;
    }
    @Override
    public String toString() {
        return "Venta{" +
                "nombre='" + Nombre + '\'' +
                ", totalVendido=" + Vendido +
                '}';
    }
}
