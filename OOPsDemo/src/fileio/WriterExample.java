package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		
		try {
			Writer w = new FileWriter("c:/demo/data.txt");
			
			String content = "She Sells Sea Shells on the Seashore";
			
			w.write(content);
			w.close();
			System.out.println("Data written in a file");
		}
		
		catch(IOException e){
			System.err.println("Error occured");
			e.printStackTrace();
		}

	}

}
