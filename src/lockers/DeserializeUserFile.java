package lockers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;


public class DeserializeUserFile {
	
	public static void main(String[] args) {
		new DeserializeUserFile();
	}
	public DeserializeUserFile() {
		List<User> listOfUsers = null;
		
		try {
			//read file to deserialized object
			FileInputStream f = new FileInputStream("file10.txt");
			ObjectInputStream s = new ObjectInputStream(f);
            listOfUsers = (List) s.readObject();
			
			s.close();
		}catch (IOException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException e1){
			e1.printStackTrace();
		}
		for (User e: listOfUsers) {
			System.out.println("Deserialized User object from file10.txt");
			System.out.println(e.toString());
		}
		
		
		}
	}


