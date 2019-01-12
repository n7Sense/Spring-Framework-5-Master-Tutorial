package model;
import factory.Car;

public class Benz implements Car{
	
	public Benz() {
		System.out.println("BENZ Constructor");
	}

    @Override
    public void design() {
        System.out.println("This Is A Benz Car");
    }    
}