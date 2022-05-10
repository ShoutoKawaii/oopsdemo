package oopsdemo1;
//Program to demostrate Constructors in Java
class Language{
	private String s;
	private int version;
	
	Language(){
		System.out.println("I Am an Implicit Constructor");
		s = "python";
		System.out.println("Hello from: "+s);
	}

	Language(String lang){
		System.out.println("I Am a Parameterized Constructor");
		this.s = lang;
		System.out.println("Hello from: "+s);
	}
	
	Language(String lang, int ver){
		System.out.println("I Am a Parameterized Constructor with 2 arguements");
		this.s = lang;
		this.version = ver;
		System.out.println("Hello from: "+s+" V."+version);
	}
}
	public class LanguagesDemo {
		public static void main(String[] args) {
		Language l1 = new Language();
		Language l2 = new Language("Ruby");
		Language l3 = new Language("ShotoTodo", 69);
		}
}



