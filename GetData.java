import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;
public class GetData extends EmployeeRegister {
 Collection employee = new ArrayList();
 String choice;
 int emp ,i;
 Scanner keyboardInput = new Scanner(System.in);
 public void getData()
 {
	 System.out.println("Enter the number of employee you would like to register:");
emp=keyboardInput.nextInt();
for(i=1; i<=emp; i++)
{
	System.out.format("enter employee %d details: ", i);
	System.out.println("Enter First Name:");
	setFirstName(keyboardInput.next());
	employee.add(getFirstName());


	System.out.println("Enter Last Name:");
	setLastName(keyboardInput.next());
	employee.add(getLastName());
	
	System.out.println("Enter Mobile:");
	setMobile(keyboardInput.next());
	employee.add(getMobile());
	
	
	System.out.println("Enter Email:");
	setEmail(keyboardInput.next());
	employee.add(getEmail());

	System.out.println("Enter Address:");
	setAddress(keyboardInput.next());
	employee.add(getAddress());
	
}
 }
 public void showData()
 {
	 Iterator it = employee.iterator();
 while(it.hasNext())
 {
	 System.out.println(it.next()+ "\t\t"+it.next()+"\t\t"+it.next() +"\t\t " +it.next()+"\t\t\t "+it.next());
	 
 }
	 
 }
}
