package Rabish;

public class Student {
	private String studentName;
	private int rollNumber;
	private String fatherName;
	private int contactNumber;
	private String address;
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setRollNumber(int rollnumber) {
		this.rollNumber=rollNumber;
	}
	public void setFatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber=contactNumber;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public String getAddress() {
		return address;
	}

}
