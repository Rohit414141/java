import java.io.*;

public class FileEx6 {
	public static void main(String[] args) {
		try {
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			String s=br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}