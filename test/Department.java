package test;
import java.util.*;
public class Department {
	
	public String dept_name;
	public List<Student> std;
	
	public Department (String dept_name)
	{
		this.dept_name=dept_name;
		std=new ArrayList<>();
	}
	
	void add_std(Student st)
	{
		std.add(st);
	}
	
	int num_std()
	{
		int count=0;
		for(Student st:std)
		{
			count++;
		}
		return count;
	}
	
}
