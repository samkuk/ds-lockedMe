package lockers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WorkingWithFiles {
public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		TreeSet<String> list = new TreeSet<String>();
		
		// create directory
		File myDir = new File("MySam");
		if (myDir.mkdir()) {
			System.out.println("the directory is created");
		}else {
			System.out.println("the directory is already exists");
		}
		//create sub directory
		File subSami = new File(myDir, "subsami");
		subSami.mkdir();
		
		//create file
		File myFile = new File(myDir,"mySami.txt");
		myFile.createNewFile();
		File myFile1 = new File(myDir, "myKuki.txt");
		myFile1.createNewFile();
		File myFile2 = new File(myDir, "myAmen.txt");
		myFile2.createNewFile();
		
		System.out.println("Name: " + myFile.getName());
		System.out.println("Path: " + myFile.getPath());
		System.out.println("AbsolutePath: " + myFile.getAbsolutePath());
		System.out.println("Parent: " + myFile.getParent());
		System.out.println("Last Modified: " + myFile.lastModified());
		System.out.println("Length: " + myFile.length());
		System.out.println("-----------------------");
		
		System.out.println("Name: " + myFile1.getName());
		System.out.println("Path: " + myFile1.getPath());
		System.out.println("AbsolutePath: " + myFile1.getAbsolutePath());
		System.out.println("Parent: " + myFile1.getParent());
		System.out.println("Last Modified: " + myFile1.lastModified());
		System.out.println("Length: " + myFile1.length());
		System.out.println("-----------------------");
		
		System.out.println("Name: " + myFile2.getName());
		System.out.println("Path: " + myFile2.getPath());
		System.out.println("AbsolutePath: " + myFile2.getAbsolutePath());
		System.out.println("Parent: " + myFile2.getParent());
		System.out.println("Last Modified: " + myFile2.lastModified());
		System.out.println("Length: " + myFile2.length());
		
		
		list.add("mySami.txt");
		list.add("myKuki.txt");
		list.add("myAmen.txt");
		
		System.out.println("----------------------");
		System.out.println(list);
		
		//Enahancing for loop
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("Enter a string to check?");
		String usr_string = sc.next();
		
		//checking if files exist in the directory
		if(list.add(usr_string) ) {
			System.out.println("Given string " + usr_string + " exists in the Directory");
		}else {
			System.out.println("Given string " + usr_string + " does not exists in the Directory");
		}
		
		//rename the file
	    myFile.renameTo(new File(myDir,"sample.txt"));
				
		//delete the file
		File d = new File(myDir,"sample.txt");
		if ( d.delete()) {
		System.out.println(d.getName() + " Deleted");
		}else {
		System.out.println("Failed");
		}
             
	}


}
