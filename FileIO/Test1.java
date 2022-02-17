package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		String name = date.toString();
		Timestamp name1 = new Timestamp(System.currentTimeMillis());
	
		System.out.println(name);
		int count =2;
		File file = new File("C:\\Users\\Mushfiq\\Desktop\\fileIo_practice\\Ahmed_"+name1+".txt");
		
		try {
			file.createNewFile();
			System.out.println(file.canWrite());
			FileWriter fw = new FileWriter(file);
			fw.write("hi iam Ahmed ");
			fw.flush();
			fw.close();
			
			file = new File("C:\\Users\\Mushfiq\\Desktop\\fileIo_practice\\Ahmed");
			file.mkdir();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.canWrite());
		
		

	}

}
