package net.Bloodbank.BbApp.model;

public enum Gender {
	MALE("MALE"), FEMALE("FEMALE"), OTHERS("OTHERS");

	private final String name;

	private Gender(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
