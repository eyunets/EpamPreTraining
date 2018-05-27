package by.epam.preTraining.eyunets.tasks.task07.utils.impl;

import java.util.Arrays;

import by.epam.preTraining.eyunets.tasks.task07.entities.CarDealership;
import by.epam.preTraining.eyunets.tasks.task07.entities.Car;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarDoorType;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarModelType;
import by.epam.preTraining.eyunets.tasks.task07.utils.CarDealershipWorker;

public class CarDealershipWorkerImpl implements CarDealershipWorker {

	private CarDealership carDealership;

	public CarDealershipWorkerImpl(CarDealership carDealership) {
		this.carDealership = carDealership;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Car car) {
		if (isEmpty()) {
			Car[] cars = new Car[1];
			cars[0] = car;
			carDealership.setCars(cars);
		} else {
			int count = carDealership.getCars().length;
			if (isFull()) {
				Car[] cars = Arrays.copyOf(carDealership.getCars(), (int) (count * 1.5 + 1));
				cars[count] = car;
				carDealership.setCars(cars);
			} else {
				Car[] cars = carDealership.getCars();
				for (int i = 0; i < count; i++) {
					if (cars[i] == null) {
						cars[i] = car;
						carDealership.setCars(cars);
						break;
					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Car... cars) {
		for (int i = 0; i < cars.length; i++) {
			add(cars[i]);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public int getCountOfElements() {
		int count = 0;
		Car[] cars = carDealership.getCars();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		Car[] cars = carDealership.getCars();
		if (cars == null) {
			return true;
		}
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Car[] getAll() {
		Car[] cars = carDealership.getCars();
		if (cars == null) {
			return null;
		}
		int nullPointer = cars.length;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				nullPointer = i;
				break;
			}
		}
		return Arrays.copyOfRange(cars, 0, nullPointer);
		// TODO Auto-generated method stub
	}

	@Override
	public Car getByIndex(int index) {
		if (isEmpty()) {
			return null;
		} else {
			Car[] cars = carDealership.getCars();
			if (cars.length >= index)
				return cars[index];
			else
				return null;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteCarByIndex(int index) {
		if (isEmpty()) {
		} else {
			Car[] cars = carDealership.getCars();
			Car[] newCars = new Car[getCountOfElements() - 1];
			if (cars.length > index) {
				for (int i = 0, j = 0; i < getCountOfElements(); i++) {
					if (i != index) {
						newCars[j] = cars[i];
						j++;
					}
				}
				carDealership.setCars(newCars);
			}
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllCars() {
		carDealership.setCars(null);
	}

	@Override
	public Car[] findByCarModelType(CarModelType carModelType) {
		Car[] searchedCars = null;
		if (!isEmpty()) {
			int count = 0;
			Car[] cars = carDealership.getCars();
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getCarModelType() == carModelType) {
					count++;
				}
			}
			searchedCars = new Car[count];
			for (int i = 0, j = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getCarModelType() == carModelType) {
					searchedCars[j] = cars[i];
					j++;
				}
			}
		}
		return searchedCars;
	}

	@Override
	public Car[] findByCarDoorType(CarDoorType carDoorType) {
		Car[] searchedCars = null;
		if (!isEmpty()) {
			int count = 0;
			Car[] cars = carDealership.getCars();
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getCarDoorType() == carDoorType) {
					count++;
				}
			}
			searchedCars = new Car[count];
			for (int i = 0, j = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getCarDoorType() == carDoorType) {
					searchedCars[j] = cars[i];
					j++;
				}
			}
		}
		return searchedCars;
	}

	@Override
	public Car[] findByManufactoryYear(int manufactoryYear) {
		Car[] searchedCars = null;
		if (!isEmpty()) {
			int count = 0;
			Car[] cars = carDealership.getCars();
			for (int i = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getManufactoryYear() == manufactoryYear) {
					count++;
				}
			}
			searchedCars = new Car[count];
			for (int i = 0, j = 0; i < cars.length; i++) {
				if (cars[i] != null && cars[i].getManufactoryYear() == manufactoryYear) {
					searchedCars[j] = cars[i];
					j++;
				}
			}
		}
		return searchedCars;
	}

	private boolean isFull() {
		Car[] cars = carDealership.getCars();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				return false;
			}
		}
		return true;
	}

}
