package com;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class LockedMeMain {
	//first options menu
    public static void firstMenu() {
    	System.out.println("");
    	System.out.println("Please state your option and press enter");
		System.out.println("a. For listing all the existing files in ascending order press   1");
		System.out.println("b. For file processing menu press                                2" );
		System.out.println("c. For quitting the app press                                    3");
		
    	
    }
    //Second options menu
    public static void secondMenu() {
    	System.out.println("");
    	System.out.println("File processing menu");
    	System.out.println("Please state your option and press enter");
		System.out.println("a. For searching a file press            1");
		System.out.println("b. For adding a new file press           2" );
		System.out.println("c. For deleting a file press             3");
		System.out.println("d. For returning to the main menu press  4");
		
    	
    }

	public static void main(String[] args) {
		
		
		//Welcome screen
		System.out.println("Welcome to LockedMe.com");
		System.out.println("This tool lets you handle files ");
		System.out.println("Developed by Calin Doboara");
		System.out.println("");
		
		int opt=0;int op3=0;
		char opt1;char opt2;
		String option;
		String fileName;
		Scanner sc = new Scanner(System.in);
		ReadFile file1= new ReadFile();
		do {
			
		    firstMenu();
			option = sc.next();
			opt1=option.charAt(0);
			if (opt1 == '1') {
				opt=1;		
				file1.ListFile();
			}
			else if(opt1=='2') {
				opt=2;				
				do {
				secondMenu();
				option = sc.next();
				opt2=option.charAt(0);
				if (opt2 == '1') {
					boolean exists;
					op3=1;
					System.out.println("Please enter the file name you want to search and press enter ");
					fileName=sc.next();
					exists=file1.findFile(fileName);
					if(exists) {
						System.out.println("The file exists");
					}else System.out.println("The file does not exist");
					
				}
				else if(opt2=='2') try{
					op3=2;
					System.out.println("Please enter the file name you want to add and press enter ");
					fileName=sc.next();
					file1.addFile(fileName);
				}catch(Exception e) {System.out.println("File creation failed");}
				else if(opt2=='3') {
					op3=3;
					System.out.println("Please enter the file name you want to delete and press enter ");
					fileName=sc.next();
					file1.deleteFile(fileName);
				}else if(opt2=='4') {
					op3=4;
					System.out.println("Returning to main menu");
				}
				else {System.out.println("Please enter a valid option");
					op3=5;
				
				}
				
				}while(op3!=4);
			}
			else if(opt1=='3') opt=3;
			else {System.out.println("Please enter a valid option");
			      
			}
				
				
			
		}while(opt!=3);
		System.out.println("Exiting App");
		

	

	}
}
