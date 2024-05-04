package test;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		
		
		
		Student st1=new Student(1,"Adarsh","VLSI");
		Student st2=new Student(2,"punith","VLSI");
		Student st3=new Student(3,"itun","VLSI");
		Student st4=new Student(4,"amith","ESD");
		Student st5=new Student(5,"priya","ESD");
		Student st6=new Student(6,"mokashi","ESD");
		Student st7=new Student(7,"prakrati","ESD");
		
		Institute in=new Institute("msis");
		
		Department esd=new Department("embedded systems");
		Department vl=new Department("VLSI");
		
		esd.add_std(st4);
		esd.add_std(st5);
		esd.add_std(st6);
		esd.add_std(st7);
		vl.add_std(st1);
		vl.add_std(st2);
		vl.add_std(st3);
		
		//System.out.println(st1.total);
		//System.out.println(st2.total);
		System.out.println(Student.total);
		
		System.out.println(esd.num_std());
		
		System.out.println(vl.num_std());
		
		in.add_dept(vl);
		in.add_dept(esd);
		
		System.out.println(in.num_tol_std());
		
		//System.out.println(in.);
		
		

	}

}
