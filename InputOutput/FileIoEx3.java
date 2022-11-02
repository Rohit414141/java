import java.io.*;

public class FileIoEx3 {
	public static void main(String[] args) {
		try {
	//Byte stream
	FileInputStream f1=new FileInputStream("E:\\mini project\\abc.txt");
	FileOutputStream f2=new FileOutputStream("E:\\mini project\\xyz.txt");
	BufferedInputStream b1=new BufferedInputStream(f1);
	BufferedOutputStream b2=new BufferedOutputStream(f2);
	
	//Character stream
//	FileReader f1=new FileReader("D:\\IncappJava\\abc.txt");
//	FileWriter f2=new FileWriter("D:\\IncappJava\\xyz.txt");
//	BufferedReader b1=new BufferedReader(f1);
//	BufferedWriter b2=new BufferedWriter(f2);
	int a;
	while((a=b1.read())!=-1) {
		b2.write((char)a);
	}
	b1.close();
	b2.close();
	f1.close();
	f2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}