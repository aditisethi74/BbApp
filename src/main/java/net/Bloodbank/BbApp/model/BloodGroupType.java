package net.Bloodbank.BbApp.model;

public enum BloodGroupType {
	A_pos("A+"),
	A_neg("A-"),
	B_pos("B+"),
	B_neg("B-"),
	O_pos("O+"),
	O_neg("O-"),
	AB_pos("AB+"),
	AB_neg("AB-");


	private final String name;

	private BloodGroupType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}