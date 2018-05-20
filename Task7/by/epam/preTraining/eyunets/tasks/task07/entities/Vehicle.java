package by.epam.preTraining.eyunets.tasks.task07.entities;

import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarDoorType;
import by.epam.preTraining.eyunets.tasks.task07.entities.enums.CarModelType;

public class Vehicle {
	private int manufactoryYear;
	private String model;
	private CarModelType carModelType;
	private CarDoorType carDoorType;
	private double price;

	public Vehicle(int manufactoryYear, String model, CarModelType carModelType, CarDoorType carDoorType,
			double price) {
		super();
		this.manufactoryYear = manufactoryYear;
		this.model = model;
		this.carModelType = carModelType;
		this.carDoorType = carDoorType;
		this.price = price;
	}

	public int getManufactoryYear() {
		return manufactoryYear;
	}

	public void setManufactoryYear(int manufactoryYear) {
		this.manufactoryYear = manufactoryYear;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carDoorType == null) ? 0 : carDoorType.hashCode());
		result = prime * result + ((carModelType == null) ? 0 : carModelType.hashCode());
		result = prime * result + manufactoryYear;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (carDoorType != other.carDoorType)
			return false;
		if (carModelType != other.carModelType)
			return false;
		if (manufactoryYear != other.manufactoryYear)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [manufactoryYear=" + manufactoryYear + ", model=" + model + ", carModelType=" + carModelType
				+ ", carDoorType=" + carDoorType + ", price=" + price + "]";
	}

}
