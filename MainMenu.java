import java.util.Scanner;

public class MainMenu {
Scanner keyboardInput= new Scanner(System.in);
String choice;
public void menu()
{
	GetData obj =new GetData();
	obj.getData();
	do {
		System.out.println("Would you like to enter more employees press Y|y for yes N|n to display added employees:");
		choice=keyboardInput.nextLine();
		switch(choice) {
		case"Y":
		case "y":
			obj.getData();
			break;
		case"N":
		case"n":
			System.out.println("First Name\tLast Name\tMobile\tEmail\t\t\t\tAddress");
			obj.showData();
			break;
		}
		}
	while(choice!="Y"|choice!="y");
	
		}
	
}

