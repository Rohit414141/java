import java.io.IOException;
public class IoEx1{
	public static void main(String s[]) {
		try {
			int a = System.in.read();
			System.out.println(a);// a = 97
			System.out.println((char)a); // a = rohit = r
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}