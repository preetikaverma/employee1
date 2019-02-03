
public class EmployeeRegister {
 String firstName,lastName,email,address, choice, mobile;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;

}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getChoice() {
	return choice;
}

public void setChoice(String choice) {
	this.choice = choice;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
 public static void main(String[] args) {
	MainMenu obj= new MainMenu();
	obj.menu();
}
}
