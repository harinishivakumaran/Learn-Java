package filesDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./resources/data.txt");
		//List<String> lines=Files.readAllLines(pathFileToRead);
		//System.out.println(lines); //[123,122, harinishivakumaran, meow, rini...]
		
		//Files.lines(pathFileToRead).forEach(System.out::println);//more efficient //process at one line
		
		Files.lines(pathFileToRead).filter(str->str.contains("i")).map(String::toLowerCase).forEach(System.out::println);
		
	}

}
