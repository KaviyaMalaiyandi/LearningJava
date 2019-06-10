package Main;

import java.util.Scanner;

import ModelDemo.Car;
import OOPS.Animal;
import OOPS.Cat;
import OOPS.Dog;

public class Main {
	public static void main(String args[]) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		cat.call();
		cat.callCats();
		
		animal.call();
		
		dog.call();
		dog.callDogs();
		
		System.out.println("------------------------------------------------------");
		
		Car car = new Car();
		car.setName("BMW");
		car.setColor("White");
		car.setPrice(100000.00);
		
		System.out.println(car.getName() +" | " +car.getColor() +" | " +car.getPrice());
		
		System.out.println("------------------------------------------------------");
		
		Car cars[] = new Car[100];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
		    System.out.println("Enter car " +(i+1) +" Name");
			String carName = scanner.next();
			System.out.println("Enter car " +(i+1) +" Color");
			String carColor = scanner.next();
			System.out.println("Enter car " +(i+1) +" Price");
			Double carPrice = scanner.nextDouble();
			
			cars[i] = new Car(carName,carPrice,carColor);
		}
		System.out.println("Thank You");
		System.out.println("------------------------------------------------------");
		
		int option = 0;
		
		while (option < 4) {
			System.out.println("Enter a option");
			System.out.println("1) Display all");
			System.out.println("2) Search");
			System.out.println("3) Add");
			System.out.println("4) Exit");

			option = scanner.nextInt();

			switch (option) {
			case 1:
				for (int i = 0; cars[i]!=null; i++) {
					System.out.println(cars[i].getName() + " | " + cars[i].getColor() + " | " + cars[i].getPrice());
				}
				break;
			case 2:
				System.out.println("Enter car name");
				String key = scanner.next();
				for (int i = 0; cars[i]!=null; i++) {
					if (cars[i].getName().equals(key)) {
						System.out.println(cars[i].getName() + " | " + cars[i].getColor() + " | " + cars[i].getPrice());
					} else {
						System.out.println("Requested car not found");
					}
				}
				break;
			case 3:
				int length=0;
				for (int i = 0; cars[i]!=null; i++) {
					length=i;
				}
				length=length+1;
				if(length<10) {
				System.out.println("Enter car " +(length+1) +" Name");
				String carName = scanner.next();
				System.out.println("Enter car " +(length+1) +" Color");
				String carColor = scanner.next();
				System.out.println("Enter car " +(length+1) +" Price");
				Double carPrice = scanner.nextDouble();
				cars[length] = new Car(carName,carPrice,carColor);
			    }
				else {
					System.out.println("List full cannot be added ");
				}
				break;
		}

	}
}
}
