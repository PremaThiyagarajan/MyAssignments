package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name: Prema");
	}
	public void studentDept() {
		System.out.println("Department: coumputer science");
	}
	public void studentId() {
		System.out.println("Student id: 1764");
	}
	public static void main(String[] args) {
	Student stu=new Student();
	
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	
	stu.studentDept();
	
	stu.studentId();
	stu.studentName();
	stu.deptName();
	

	}

}
