package filesDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
		//Files.list(currentDirectory).forEach(System.out::println); 
		//can find the path where the folder is saved 
		
		Predicate<? super Path> predicate=path->String.valueOf(path).contains(".java"); 
		//for printing only the java folder
		
		//recursively
		//Files.walk(currentDirectory,4).filter(predicate).forEach(System.out::println); //4 - level
		//walk is to look into the path
		
		BiPredicate<Path, BasicFileAttributes> javaMatcher=(path,attributes)->String.valueOf(path).contains(".java");
		//filter based on name of the file or by certain characteristics
		
		BiPredicate<Path, BasicFileAttributes> directoryMatcher=(path,attributes)->attributes.isDirectory();
		
		Files.find(currentDirectory, 4, directoryMatcher ).forEach(System.out::println);
		
		Files.find(currentDirectory, 4, javaMatcher ).forEach(System.out::println);
		
	}

}
