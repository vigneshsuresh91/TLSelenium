package week1.day2;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empID) {
		System.out.println("The Employee Name is : "+empName+" and the Employee ID is :"+empID);
	}

	public void getEmployeeAddress(String empAddress) {
		System.out.println("The Address of the Employee is : "+empAddress);
	}
	
	public void printEmployeeSalary(double empSalary) {
		System.out.println("The Salary of the Employee is : "+empSalary);
	}
	
	public void printEmployeePhoneNumber(long mobNumber) {
		System.out.println("The phone Number of the Employee is : "+mobNumber);
	}
	
	public static void main(String[] args) {
		EmployeeDetails empObj = new EmployeeDetails();
		
		empObj.printEmployeeName("Vignesh", 1124521);
		empObj.getEmployeeAddress("Coimbatore 21 @#$");
		empObj.printEmployeeSalary(3400.56789);
		empObj.printEmployeePhoneNumber(99999800000998L);
	}
}