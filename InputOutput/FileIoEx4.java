import java.io.*;
public class FileIoEx4{
	public static void main(String s[]) {
		try {
			//Write 
//			FileOutputStream f  = new FileOutputStream("E:\\mini project\\xyy.txt");
//			DataOutputStream d = new DataOutputStream(f);
//		    d.writeDouble(10.20);
		    
			
			// Read
//			
			FileInputStream f=new FileInputStream("E:\\mini project\\xyz.txt");
			DataInputStream d=new DataInputStream(f);
			System.out.println(d.readDouble());
			d.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}