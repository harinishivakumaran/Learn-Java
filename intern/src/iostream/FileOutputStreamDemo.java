package iostream;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("E:/harini/cog/training/java/udemy/javamadeeasycourse/pic.jpeg");
			fos=new FileOutputStream("E:/harini/cog/training/java/udemy/javamadeeasycourse/newpic1.jpeg");
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
