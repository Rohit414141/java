import java.io.*;

public class FileIoEx5 {
	public static void main(String[] args) {
		try {
	//Byte stream
	FileOutputStream f=new FileOutputStream("E:\\mini project\\xyy.txt");
	PrintStream p=new PrintStream(f);
	
	//Character stream
//	FileWriter f=new FileWriter("D:\\IncappJava\\xyz.txt");
//	PrintWriter p=new PrintWriter(f);
	
	p.println("hello INCAPP");
	p.println(2.7);
	p.println(10+" rahul");
	
	p.close();
	f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}