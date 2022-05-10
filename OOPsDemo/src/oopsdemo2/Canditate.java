package oopsdemo2;

public class Canditate {
		private int id;
		private String name;
		protected double salary;
		public Canditate(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		void display()
		{
			System.out.println("*Candidate Details*");
			System.out.println(this.id+" "+this.name+" "+this.salary);
			
		}
		

	}


