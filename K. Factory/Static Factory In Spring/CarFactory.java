package factory;
import model.*;

public class CarFactory {
    
    private static String carName;

    public static Car getCar() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        return (Car)Class.forName(className).newInstance();
    }

    public String setCarName(String carName){
    	this.carName = carName;
    }	
}