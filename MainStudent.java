package MainClass;

import Controller.studentcontroller;
import Model.student;
import View.studentview;

public class MainStudent {

	public static void main(String[] args) {
		
		student std = retrive();
		
		studentview sv = new studentview();
		
		studentcontroller sc = new studentcontroller(std, sv);
		sc.viewcontrol();
		//std.setName("tpoo"); setName() can be called directly form class student..
		sc.setStudentName("sujan");
		sc.setStudentRoll("11");
		sc.setStudentAddress("bhaktpur");
		sc.viewcontrol();
		
	}

	private static student retrive()
	{
		student student = new student();
	    student.setName("bibek");
	    student.setRoll("21");
	    student.setAddress("chapagaun");
	    return student;
	}
}
