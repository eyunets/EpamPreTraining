package by.epam.preTraining.eyunets.tasks.task07.entities;

import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarDoorType;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarModelType;

public class Car extends Vehicle {

	private String model;
	private CarModelType carModelType;
	private CarDoorType carDoorType;

	public Car() {
		super();
	}

	public Car(int manufactoryYear, double price, String model, CarModelType carModelType, CarDoorType carDoorType) {
		super(manufactoryYear, price);
		this.model = model;
		this.carModelType = carModelType;
		this.carDoorType = carDoorType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarModelType getCarModelType() {
		return carModelType;
	}

	public void setCarModelType(CarModelType carModelType) {
		this.carModelType = carModelType;
	}

	public CarDoorType getCarDoorType() {
		return carDoorType;
	}

	public void setCarDoorType(CarDoorType carDoorType) {
		this.carDoorType = carDoorType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((carDoorType == null) ? 0 : carDoorType.hashCode());
		result = prime * result + ((carModelType == null) ? 0 : carModelType.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carDoorType != other.carDoorType)
			return false;
		if (carModelType != other.carModelType)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", carModelType=" + carModelType + ", carDoorType=" + carDoorType + "]";
	}

}
