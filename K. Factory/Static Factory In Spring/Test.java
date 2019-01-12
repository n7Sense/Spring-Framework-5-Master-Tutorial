package test;
import factory.Car;
import factory.CarFactory;

public class Test {		   
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        
        ApplicationContext ap =new ClassPathXmlApplicationCOntext("spring.xml");
        Car  car = (Car)ap.getBean("cf");
        car.design();
    }
}