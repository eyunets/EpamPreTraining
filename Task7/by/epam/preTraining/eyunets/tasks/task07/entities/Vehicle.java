package by.epam.preTraining.eyunets.tasks.task07.entities;

public class Vehicle {
	private int manufactoryYear;
	private double price;

	public Vehicle() {
	};

	public Vehicle(int manufactoryYear, double price) {
		super();
		this.manufactoryYear = manufactoryYear;
		this.price = price;
	}

	public int getManufactoryYear() {
		return manufactoryYear;
	}

	public void setManufactoryYear(int manufactoryYear) {
		this.manufactoryYear = manufactoryYear;
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
		result = prime * result + manufactoryYear;
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
		if (manufactoryYear != other.manufactoryYear)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [manufactoryYear=" + manufactoryYear + ", price=" + price + "]";
	}

}
