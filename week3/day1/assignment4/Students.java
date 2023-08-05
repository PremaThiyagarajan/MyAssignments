package week3.day1.assignment4;

public class Students {
	public void getStudentInfo(int id , String name) {
		System.out.println("Student Id:" +id );
		System.out.println("Student name:" +name);
		
	}
	public void getStudentInfo(int id) {
		System.out.println("Student Id:" +id );
				
	}
	public void getStudentInfo(String email , long phno) {
		System.out.println("Student email:" +email );
		System.out.println("Student phno:" +phno);
				
	}
	
	

	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(12356);
		stu.getStudentInfo(12356, "Prema Thiyagarajan");
	stu.getStudentInfo("rtsprema@gmail.com", 9876543210l);

	}

}
