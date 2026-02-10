package Assessment1;

class Company {
	String name;
	double salary;
	Company(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Salary:"+ salary);
	}
	double calculateSalary() {
		return salary;
	}
}
class manager extends Company{
	double bonus;
	manager(String name,double salary,double bonus) {
	super(name,salary);
	this.bonus=bonus;
	}
 void display() {
	 super.display();
	 System.out.println("bonus:"+bonus);
		
	 }
 double calculateSalary() {
	 return super.calculateSalary()+bonus;
   }
 }
class Employee1 {
	public static void main(String[]args) {
		Company manager=new manager ("pooja",50000,10000);  
		manager.display();
		System.out.println("Total Salary:"+manager.calculateSalary());
	}
}  
	

