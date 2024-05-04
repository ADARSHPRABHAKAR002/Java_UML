package test;
import java.util.*;
public class Institute {
	private String inst_name;
	private List<Department> dept;
	
	public Institute(String inst_name)
	{
		this.inst_name=inst_name;
		dept=new ArrayList<>();
		
	}
	
	void add_dept(Department dep)
	{
		dept.add(dep);
	}
	
	int num_tol_std()
	{
		int total=0;
		for(Department de:dept)
		{
			total+=de.num_std();
		}
		return total;
	}
	
	
	
}
