package by.epam.preTraining.eyunets.tasks.task07.entities.enums;

public enum CarModelType {
	SEDAN("SEDAN"), STATION_WAGON("STATION_WAGON"), HATCHBACK("HATCHBACK");

	private String type;

	public String getType() {	
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	CarModelType(String type) {
		this.type = type;
	}
}
