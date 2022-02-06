package lockers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializeUserFile {
	public static void main(String[] args) {
		new SerializeUserFile();
	}
	
	public SerializeUserFile() {
		//create an user object
		User input = new User(1, "Sami", "sami@gmail.com", "123456");
		
		List<User> listOfUsers = new ArrayList<>();
		listOfUsers.add(new User(1, "Kuki", "kuki@gmail.com", "5678912"));
		listOfUsers.add(new User(2, "Almi", "almi@gmail.com", "34567788"));
		
		try {
			//output stream chaining 
			FileOutputStream f = new FileOutputStream("file10.txt");
			ObjectOutputStream s = new ObjectOutputStream(f);
			//s.writeObject
			s.writeObject(listOfUsers);
			System.out.println("Serialization / Write operation in the File is completed ");
			s.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e1) {
			e1.printStackTrace();
		
		}
	}

}
