package by.epam.preTraining.eyunets.tasks.task07.entities.enums;

public enum CarDoorType {
	FIVE_DOOR("FIVE_DOOR"), THREE_DOOR("THREE_DOOR");

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	CarDoorType(String type) {
		this.type = type;
	}
}
