package oopsdemo1;


class Test{
	    
		public void finalize()  // override finalize() method of Object class
	    {
	        System.out.println("Object Destroyed & Garbage Collected");
	    }
}
public class DestructorDemo {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		 
		t1 = null;
		t2 = null;
		t3 = null;
		
		System.gc();
		System.out.println("In Main Method");
				

	}

}
