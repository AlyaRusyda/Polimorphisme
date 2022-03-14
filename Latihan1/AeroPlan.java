package javaapplication2.Polimorphisme.Latihan1;

public class AeroPlan extends Vehicle {

    @Override
    public void walk() {
        System.out.println("Aeroplan Flying");
    }
    public void fuel(){
        System.out.println("fuels");
    }
    
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}