	How to create Factory Class Demo.?
=========================================

1. Interface 
	+--------------------------------------------------------------------------------------+
		package factory;

		public interface Car {
		    public void design();   
		}
	+--------------------------------------------------------------------------------------+


2. Implementor Vendor

	+--------------------------------------------------------------------------------------+

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

		++++++++++++++++++++++++++++
		
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
	+--------------------------------------------------------------------------------------+

3. Factory Vendor

	+--------------------------------------------------------------------------------------+
		package factory;
		import model.*;
		
		public class CarFactory {
		    
		    public static Car getCar(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		        return (Car)Class.forName(className).newInstance();
		    }
		}
	+--------------------------------------------------------------------------------------+


4. Main Class

	+--------------------------------------------------------------------------------------+
		package test;
		import factory.Car;
		import factory.CarFactory;

		public class Test {		   
		    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
		        Car car = CarFactory.getCar("model.Benz");
		        car.design();
		    }
		}
	+--------------------------------------------------------------------------------------+

5. OutPut:
	
	+--------------------------------------------------------------------------------------+
	*if : Car car = CarFactory.getCar("model.Benz");

		run:
		BENZ Constructor
		This Is A BENZ Car
		BUILD SUCCESSFUL (total time: 0 seconds)
			
	*if : Car car = CarFactory.getCar("model.Maruti");

		run:
		Marurit Constructor
		This Is A Maruti Car
		BUILD SUCCESSFUL (total time: 0 seconds)
	+--------------------------------------------------------------------------------------+