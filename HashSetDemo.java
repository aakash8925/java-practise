package javaproject;
import java.util.*;

class Students
{
	int Id;
	String Name;
	String Course;
	
	Students(int id, String name, String Course)
	{
		Id = id;
		Name = name;
		this.Course = Course;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(Name);
	}
	
	public boolean equals(Object obj)
	{
		if(this == obj) //Check the Memory reference
			return true;
		
		if(!(obj instanceof Students))
		{
			return false;
		}
		
		Students OBJ = (Students)obj;
		
		return this.Name == OBJ.Name; //True 
		
	}
	
	public void DisplayDetails()
	{
		System.out.println("Student Id: "+ Id);
		System.out.println("Student Name: "+Name);
		System.out.println("Course: "+Course);
	}
}

public class HashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashSet<Students> stu = new HashSet<>();
		
		stu.add(new Students(101, "Vinoth", "Java"));
		stu.add(new Students(102, "Vinoth", "Python"));
		stu.add(new Students(104, "Vinoth", "Python"));
		stu.add(new Students(103, "manoj", "Dot Net"));
		
		for(Students obj : stu)
		{
			System.out.println(obj);
			obj.DisplayDetails();
			System.out.println("\n");
		}
		
		System.out.println("Enter An Id: ");
	    int stuId =	sc.nextInt();
	    
		for(Students obj : stu)
		{
			if(obj.Id == stuId)
			{
				obj.DisplayDetails();
			}
		}
		
		
	}

}
