package by.epam.preTraining.eyunets.tasks.task07.entities;

import java.util.Arrays;

public class CarDealership {
	private Adress adress;
	private Car[] cars;

	public CarDealership(Adress adress) {
		super();
		this.adress = adress;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + Arrays.hashCode(cars);
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
		CarDealership other = (CarDealership) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (!Arrays.equals(cars, other.cars))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarDealership [adress=" + adress + ", cars=" + Arrays.toString(cars) + "]";
	}
}
