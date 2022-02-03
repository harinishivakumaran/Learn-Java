package iostream;

import java.io.File;
import java.io.FileReader ;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {
		FileReader  f = null;
		try {
			f = new FileReader (new File("E:/harini/cog/training/java/udemy/javamadeeasycourse/myfile.txt"));
			System.out.println("File opened");

			int i;
			while ((i = f.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}
		
	}

}
