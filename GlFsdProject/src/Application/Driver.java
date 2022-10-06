package Application;

import Services.AdminDepartment;
import Services.HRDepartment;
import Services.TechDepartment;
import Services.SuperDepartment;

class Driver{
 public static void main(String[] args) {
	AdminDepartment admin = new AdminDepartment();
	System.out.println("Welcome to "+ admin.departmentName());
	System.out.println( admin.getTodayWork());
	System.out.println(admin.getWorkDeadline());
	System.out.println(admin.isTodayAHoliday());
	
	
	HRDepartment hr = new HRDepartment();
	System.out.println("\nWelcome to "+  hr.departmentName());
	System.out.println( hr.doActivity());
	System.out.println( hr.getTodayWork());
	System.out.println( hr.getWorkDeadline());
	System.out.println( hr.isTodayAHoliday());
	
	TechDepartment tech = new TechDepartment();
	System.out.println("\nWelcome to "+ tech.departmentName());
	System.out.println(tech.getTodayWork());
	System.out.println(tech.getWorkDeadline());
	System.out.println(tech.getTechStackInformation());
	System.out.println(tech.isTodayAHoliday());
	
	
	
}
}