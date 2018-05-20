package by.epam.preTraining.eyunets.tasks.task07.utils;

import by.epam.preTraining.eyunets.tasks.task07.entities.Vehicle;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarDoorType;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarModelType;

public interface CarDealershipWorker {
	public void add(Vehicle vehicle);

	public void add(Vehicle... vehicles);

	public int getCountOfElements();

	public boolean isEmpty();

	public Vehicle[] getAll();

	public Vehicle getByIndex(int index);

	public void deleteVehicleByIndex(int index);

	public void deleteAllVehicles();

	public Vehicle[] findByCarModelType(CarModelType carModelType);

	public Vehicle[] findByCarDoorType(CarDoorType carDoorType);

	public Vehicle[] findByManufactoryYear(int manufactoryYear);

}
