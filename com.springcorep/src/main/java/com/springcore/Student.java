package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public int getStudentId() {
		//System.out.println("call getstudent id ......");
		return studentId;
	}

	public void setStudentId(int studentId) {
		//System.out.println("call setstudent id ......");
		this.studentId = studentId;
	}

	public String getStudentName() {
		//System.out.println("call getstudent name ......");
		return studentName;
	}

	public void setStudentName(String studentName) {
		//System.out.println("call setstudent name ......");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		//System.out.println("call getstudent Add ......");
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		//System.out.println("call setstudent Add ......");
		this.studentAddress = studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "-----Student---- \n[ Id   \t=" + studentId + ",\n  Name \t=" + studentName + ",\n  Address ="
				+ studentAddress + " ] ";
	}
}
