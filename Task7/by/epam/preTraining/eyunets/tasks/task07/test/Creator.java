package by.epam.preTraining.eyunets.tasks.task07.test;

import by.epam.preTraining.eyunets.tasks.task07.entities.Adress;
import by.epam.preTraining.eyunets.tasks.task07.entities.Car;
import by.epam.preTraining.eyunets.tasks.task07.entities.CarDealership;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarDoorType;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarModelType;
import by.epam.preTraining.eyunets.tasks.task07.utils.CarDealershipWorker;
import by.epam.preTraining.eyunets.tasks.task07.utils.impl.CarDealershipWorkerImpl;
import by.epam.preTraining.eyunets.tasks.task07.viewOut.CarVO;

public class Creator {
	public static void create() {
		Adress adress = new Adress("Minsk", "Esenina", 143);
		CarDealership carDealership = new CarDealership(adress);
		Car car = new Car(1994, 10000, "Renaught", CarModelType.HATCHBACK, CarDoorType.FIVE_DOOR);
		Car car2 = new Car(1994, 500000, "Audi", CarModelType.SEDAN, CarDoorType.THREE_DOOR);
		CarDealershipWorker carDealershipWorker = new CarDealershipWorkerImpl(carDealership);
		carDealershipWorker.add(car, car2);
		carDealershipWorker.add(car2);
		carDealershipWorker.add(car);
		carDealershipWorker.deleteCarByIndex(10);
		carDealershipWorker.deleteCarByIndex(0);
		carDealershipWorker.deleteCarByIndex(0);
		carDealershipWorker.deleteCarByIndex(0);
		CarVO.viewCar(carDealershipWorker.getAll());
	}

}
