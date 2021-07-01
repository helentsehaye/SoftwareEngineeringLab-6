package edu.miu.cs425.demo.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
	
	private int studentId;
	private String name;
	private LocalDate dateOfadmission;
	
	public Student(int studentId, String name, LocalDate dateOfadmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfadmission = dateOfadmission;
	}
	
	public Student() {
		super();
		
	}

	public double getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfadmission;
	}

	public void setDateOfadmission(LocalDate dateOfadmission) {
		this.dateOfadmission = dateOfadmission;
	}

	@Override
	public String toString() {
		return String.format("Student [studentId=%s, name=%s, dateOfadmission=%s]", studentId, name, dateOfadmission);
	}
	
	

}
