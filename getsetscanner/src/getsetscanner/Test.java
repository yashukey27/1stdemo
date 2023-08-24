package getsetscanner;
import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		employee e=new employee();
		 System.out.println("enter first Empolyee Id");
		    e.setId(sc.nextInt());
		 System.out.println("enter first Empolyee Name");
		    e.setName(sc.next());
        System.out.println("enter first Empolyee Salary");
            e.setSalary(sc.nextFloat());
        
		
        employee e1=new employee();
     System.out.println("enter second Empolyee Id");
        e1.setId(sc.nextInt());
        System.out.println("enter second Empolyee Name");
        e1.setName(sc.next());
        System.out.println("enter second Empolyee Salary");
        e1.setSalary(sc.nextFloat());
        

	}

}
