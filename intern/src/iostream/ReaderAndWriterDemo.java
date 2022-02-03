package iostream;

import java.io.*;
public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {
		FileReader fr=null;
		FileWriter fw=null;
		
		fr=new FileReader("E:/harini/cog/training/java/udemy/javamadeeasycourse/myfile.txt");
		fw=new FileWriter("E:/harini/cog/training/java/udemy/javamadeeasycourse/newfile1.txt");
		
		int ch;
		while((ch=fr.read())!=-1) {
			
			fw.write(ch);
						
		}
		fr.close();
		fw.close();
	}

}
