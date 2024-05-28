package exceptions;
 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;
 
public class PrintWriteExample {
	public static void main(String[] args) {
		String fileName = "bsp.txt";
		try (PrintWriter writer = new PrintWriter (fileName)) {
			LocalTime now = LocalTime.now();
			writer.print(now);
		} catch(FileNotFoundException e) {
			System.out.println("Fehler");
		}


 
}
}