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
		
		/*for(int i=0;i<3;i++) {
		    System.out.println("Enter car " 3+(i+1) +" Name");
			String carName = scanner.next();
			System.out.println("Enter car " +(i+1) +" Color");
			String carColor = scanner.next();
			System.out.println("Enter car " +(i+1) +" Price");
			Double carPrice = scanner.nextDouble();
			
			cars[i] = new Car(carName,carPrice,carColor);
		}
		System.out.println("Thank You");
		System.out.println("------------------------------------------------------");*/
		
		int option = 0;
		int next=0;
		int count=0;
		
		while (option < 6) {
			System.out.println("Enter a option");
			System.out.println("1) Display all");
			System.out.println("2) Search");
			System.out.println("3) Add");
			System.out.println("4) Delete");
			System.out.println("5) Update");
			System.out.println("6) Exit");

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
						count++;
						System.out.println(cars[i].getName() + " | " + cars[i].getColor() + " | " + cars[i].getPrice());
					} 
				}
				if(count==0) {
						System.out.println("Requested car not found");
					}

				break;
			case 3:
				if(next<10) {
				System.out.println("Enter car " +(next+1) +" Name");
				String carName = scanner.next();
				System.out.println("Enter car " +(next+1) +" Color");
				String carColor = scanner.next();
				System.out.println("Enter car " +(next+1) +" Price");
				Double carPrice = scanner.nextDouble();
				cars[next] = new Car(carName,carPrice,carColor);
				next=next+1;
			    }
				else {
					System.out.println("List full cannot be added ");
				}
				break;
			case 4:
				System.out.println("Enter car name");
				String delete = scanner.next();
				for(int i=0;cars[i]!=null;i++) {
					if(cars[i].getName().equals(delete)) {
						count++;
						for(int j=i;cars[j]!=null;j++) {
						cars[j]=cars[j+1];
						next--;
					}
				}
				}
				if(count==0) {
					System.out.println("Requested car not found");
				}
				break;
			case 5:
				System.out.println("Enter car name");
				String update = scanner.next();
				for(int i=0;cars[i]!=null;i++) {
					if(cars[i].getName().equals(update)) {
						count++;
						String carName=update;
						System.out.println("Enter car " +(i+1) +" Color");
						String carColor = scanner.next();
						System.out.println("Enter car " +(i+1) +" Price");
						Double carPrice = scanner.nextDouble();
						cars[i] = new Car(carName,carPrice,carColor);
					}
		}
				if(count==0) {
					System.out.println("Requested car not found");
				}
				break;

	}
}
}
}
