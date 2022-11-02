import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingEx5 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			FileInputStream f=new FileInputStream("D:\\web design\\HTML\\RangeEx.docx");
		}catch (FileNotFoundException e) {
			System.out.println("exception aaya re!");
		}
		System.out.println("Bye");
	}
}