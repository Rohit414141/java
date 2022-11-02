import java.io.*;
public class FileEx1{
	public static void main(String s[]) {
		try {
			//Byte Stream
			//FileInputStream f = new FileInputStream("E:\\mini project\\abc.txt");
			 //Character Stream
		   FileReader f = new FileReader("E:\\mini project\\abc.txt");
			int a;
			while((a=f.read())!=-1){
				//System.out.println(a);// output byte code
			System.out.print((char)a);// output character
			}
			f.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

