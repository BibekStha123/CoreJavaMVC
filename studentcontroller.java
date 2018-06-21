package Controller;

import Model.student;
import View.studentview;

public class studentcontroller {

	private student std;
	private studentview stdview;
	
	public studentcontroller(student model, studentview view)
	{
		this.std=model;
		this.stdview=view;
		
	}
	
	public void setStudentName(String name)	//calls the setName from student
	{
		std.setName(name);
	}
	
	public String getStudentName()
	{
		return std.getName();
	}
  
	public void setStudentRoll(String roll)	
	{
		std.setRoll(roll);
	}
	
	public String getStudentRoll()
	{
		return std.getRoll();
	}
	
	public void setStudentAddress(String add)
	{
		std.setAddress(add);
	}
	
	public String getStudentAddress()
	{
		return std.getAddress();
	}
	public void viewcontrol()
	{
		stdview.printDetails(std.getName(), std.getRoll(),std.getAddress());
	}

}
