package oopsdemo2;

public class JavaCanditate extends Canditate{
		private String tech;
		private double perks;
		
		
		public JavaCanditate(int id, String name, double salary, String t) {
		
		super(id, name, salary);
		this.tech = t;
		}
		void getperks()
		{
			salary=salary*.10;
			System.out.println("perks of candidate"+perks);
		}
		void display()
		{
			super.display();
			System.out.println("tech");
		}

}
