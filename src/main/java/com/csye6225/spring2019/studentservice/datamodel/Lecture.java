package com.csye6225.spring2019.studentservice.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

	private List<String> notes;
	private String associatedMaterial;

	public Lecture() {
		notes = new ArrayList<>();
	}

	public Lecture(List<String> notes, String associatedMaterial) {
		this.notes = notes;
		this.associatedMaterial = associatedMaterial;
	}

	public List<String> getNotes() {
		return notes;
	}

	public void setNotes(List<String> notes) {
		this.notes = notes;
	}

	public String getAssociatedMaterial() {
		return associatedMaterial;
	}

	public void setAssociatedMaterial(String associatedMaterial) {
		this.associatedMaterial = associatedMaterial;
	}
}
