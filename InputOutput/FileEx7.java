import java.io.*;

public class FileEx7 {
	public static void main(String[] args) {
		try {
	FileOutputStream f=new FileOutputStream("E:\\mini project\\xyy.txt");
	PrintStream p=new PrintStream(f);
	p.println("Hello INCAPP");
	System.out.println("Hi INDIA");
	System.setOut(p);
	System.out.println("Hi INDIA");
	p.close();
	f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}