import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class ReadFile {

	public static void main(String[] args) 
	{
		try
		{
			//Creating a file
			File file=new File("C:\\Hello.txt");
			
			//Writing on file
			FileWriter writer=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(writer);
			bw.write("Hello Java");
			bw.close();											// Need to close this as these are in RAM,else nothing will be saved in file
			writer.close();
			
			//Reading from a file
			FileReader reader=new FileReader(file);
			BufferedReader br=new BufferedReader(reader);
			String S=br.readLine();
			System.out.println(S);
			br.close();
			reader.close();
			
		}
		catch(Exception e)
		{
			
		}
		

	}

}
