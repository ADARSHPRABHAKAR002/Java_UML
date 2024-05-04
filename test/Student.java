package test;
import java.util.*;
public class Student {
	private String std_name;
	private String dept_name;
	private int id;
	public static int total;
	
	public Student(int id,String name, String dept_name)
	{
		this.id=id;
		std_name=name;
		this.dept_name=dept_name;
		total++;
		
	}
	
	public String get_name()
	{
		return std_name;
	}
	
	
	
}
