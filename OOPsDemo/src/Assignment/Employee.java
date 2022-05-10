package Assignment;

public class Employee {
		
		String name;
		int yoj;
		double salary;
		String add;
		
		public Employee(String name, int yoj, double salary, String add) {
			this.name = name;
			this.yoj = yoj;
			this.salary = salary;
			this.add = add;
		}
		
		void display() {
			
			System.out.println(this.name+"\t      "+this.yoj+"\t\t "+this.add);
		}
			
		public static void main(String[] args) {
			Employee e1 = new Employee("Robert", 1994, 6969, "64C- WallsStreet");
			Employee e2 = new Employee("Sam", 2000, 6969, "68D- WallsStreet");
			Employee e3 = new Employee("John", 1999, 6969, "26B- WallsStreet");
			
			System.out.println("Name \t Year of Joining \t Addreses");
			e1.display();
			e2.display();
			e3.display();
		}
		}
		
		



