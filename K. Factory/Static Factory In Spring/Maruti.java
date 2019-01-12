package model;
import factory.Car;

public class Maruti implements Car{
    
    public Maruti(){
        System.out.println("Marurit Constructor");
    }

    @Override
    public void design() {
        System.out.println("This Is A Maruti Car");
    }
}