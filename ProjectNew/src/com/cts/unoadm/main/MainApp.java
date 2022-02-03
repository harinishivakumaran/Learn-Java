package com.cts.unoadm.main;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.cts.unoadm.skeletonvalidator.SkeletonValidator;
import com.cts.unoadm.service.StudentAdmissionService;
import com.cts.unoadm.exception.StudentAdmissionException;

public class MainApp {
	public static void main(String[] args) throws IOException {
//Don't delete this code
//Skeletonvalidaton starts
		new SkeletonValidator();
//Skeletonvalidation ends
//Write your code here..
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StudentAdmissionService stdAdmService = new StudentAdmissionService();
		try {
// File file = new File("inputFeed.txt");
//
// BufferedReader br = new BufferedReader(new FileReader(file));
//
// String st;
// while ((st = br.readLine()) != null)
// System.out.println(st);
// br.close();
			if (stdAdmService.addStudentAdmissionDetails("inputFeed.txt")) {
				System.out.println("Data has been inserted into database");
			} else {
				System.out.println("Database insertion failed");
			}
			System.out.print("Enter a admission Id to search status - ");
			String admissionId = sc.nextLine();
			if (stdAdmService.searchStudentAdmission(admissionId)) {
				System.out.println("Student admission found");
			} else {
				System.out.println("Can't be found on database");
			}
		} catch (StudentAdmissionException e) {
			System.out.println(e.getMessage());
		}
	}
}