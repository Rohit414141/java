import java.io.*;

public class FileIoEx2 {
	public static void main(String[] args) {
		try {
	//Byte stream
	FileInputStream f1=new FileInputStream("E:\\mini project\\abc.txt");
	FileOutputStream f2=new FileOutputStream("E:\\mini project\\xyz.txt");//write mode
	//FileOutputStream f2=new FileOutputStream("D:\\IncappJava\\xyz.txt",true);//append mode
	
	//Character stream
	//FileReader f1=new FileReader("D:\\IncappJava\\abc.txt");
	//FileWriter f2=new FileWriter("D:\\IncappJava\\xyz.txt");//write mode
	//FileWriter f2=new FileWriter("D:\\IncappJava\\xyz.txt",true);//append mode
	
	int a;
	while((a=f1.read())!=-1) {
		f2.write((char)a);
	}
	f1.close();
	f2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}