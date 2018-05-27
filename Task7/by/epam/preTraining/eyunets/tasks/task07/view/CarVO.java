package by.epam.preTraining.eyunets.tasks.task07.view;

import by.epam.preTraining.eyunets.tasks.task07.entities.Car;

public class CarVO {

	public static void viewCar(Car[] cars) {
		if (cars == null) {
			System.out.println("No cars");
		} else {
			if (cars.length == 0) {
				System.out.println("No cars");
			} else {
				for (int i = 0; i < cars.length; i++)
					System.out.println(cars[i].toString());
			}
		}
	}
}
