package by.epam.preTraining.eyunets.tasks.task07.utils.impl;

import java.util.Arrays;

import by.epam.preTraining.eyunets.tasks.task07.entities.CarDealership;
import by.epam.preTraining.eyunets.tasks.task07.entities.Vehicle;
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
	public void add(Vehicle vehicle) {
		if (isEmpty()) {
			Vehicle[] vehicles = new Vehicle[2];
			vehicles[0] = vehicle;
			carDealership.setVehicles(vehicles);
		} else {
			int count = carDealership.getVehicles().length;
			if (isFull()) {
				Vehicle[] vehicles = Arrays.copyOf(carDealership.getVehicles(), (int) (count * 1.5 + 1));
				vehicles[count] = vehicle;
				carDealership.setVehicles(vehicles);
			} else {
				Vehicle[] vehicles = carDealership.getVehicles();
				for (int i = 0; i < count; i++) {
					if (vehicles[i] == null) {
						vehicles[i] = vehicle;
						carDealership.setVehicles(vehicles);
						break;
					}
				}
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Vehicle... vehicles) {
		for (int i = 0; i < vehicles.length; i++) {
			add(vehicles[i]);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public int getCountOfElements() {
		int count = 0;
		Vehicle[] vehicles = carDealership.getVehicles();
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				count++;
			}
		}
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		Vehicle[] vehicles = carDealership.getVehicles();
		if (vehicles == null) {
			return true;
		}
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Vehicle[] getAll() {
		Vehicle[] vehicles = carDealership.getVehicles();
		if (vehicles == null) {
			return null;
		}
		int nullPointer = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				nullPointer = i;
				break;
			}
		}
		return Arrays.copyOfRange(vehicles, 0, nullPointer);
		// TODO Auto-generated method stub
	}

	@Override
	public Vehicle getByIndex(int index) {
		if (isEmpty()) {
			return null;
		} else {
			Vehicle[] vehicles = carDealership.getVehicles();
			if (vehicles.length >= index)
				return vehicles[index];
			else
				return null;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteVehicleByIndex(int index) {
		if (isEmpty()) {
		} else {
			Vehicle[] vehicles = carDealership.getVehicles();
			Vehicle[]newVehicles = new Vehicle[vehicles.length-1];
			if (vehicles.length > index) {
				for(int i = 0, j = 0; i < vehicles.length;i++) {
					if (i==index) {
						i++;
					}
					else {
						newVehicles[j] = vehicles[i];
						j++;
					}
				}
				carDealership.setVehicles(newVehicles);
			}
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAllVehicles() {
		carDealership.setVehicles(null);
	}

	@Override
	public Vehicle[] findByCarModelType(CarModelType carModelType) {
		Vehicle[] searchedVehicles = null;
		if (!isEmpty()) {
			int count = 0;
			Vehicle[] vehicles = carDealership.getVehicles();
			for (int i = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getCarModelType() == carModelType) {
					count++;
				}
			}
			searchedVehicles = new Vehicle[count];
			for (int i = 0, j = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getCarModelType() == carModelType) {
					searchedVehicles[j] = vehicles[i];
					j++;
				}
			}
		}
		return searchedVehicles;
	}

	@Override
	public Vehicle[] findByCarDoorType(CarDoorType carDoorType) {
		Vehicle[] searchedVehicles = null;
		if (!isEmpty()) {
			int count = 0;
			Vehicle[] vehicles = carDealership.getVehicles();
			for (int i = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getCarDoorType() == carDoorType) {
					count++;
				}
			}
			searchedVehicles = new Vehicle[count];
			for (int i = 0, j = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getCarDoorType() == carDoorType) {
					searchedVehicles[j] = vehicles[i];
					j++;
				}
			}
		}
		return searchedVehicles;
	}

	@Override
	public Vehicle[] findByManufactoryYear(int manufactoryYear) {
		Vehicle[] searchedVehicles = null;
		if (!isEmpty()) {
			int count = 0;
			Vehicle[] vehicles = carDealership.getVehicles();
			for (int i = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getManufactoryYear() == manufactoryYear) {
					count++;
				}
			}
			searchedVehicles = new Vehicle[count];
			for (int i = 0, j = 0; i < vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getManufactoryYear() == manufactoryYear) {
					searchedVehicles[j] = vehicles[i];
					j++;
				}
			}
		}
		return searchedVehicles;
	}

	private boolean isFull() {
		Vehicle[] vehicles = carDealership.getVehicles();
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				return false;
			}
		}
		return true;
	}

}
