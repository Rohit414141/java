import java.io.*;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\mini project\\a.txt");
		if(f.exists()) {
			System.out.println("file exist");
			//file rename code
			File nf=new File("E:\\mini project\\aa.txt");
			f.renameTo(nf);
			//end- file rename code
			//f.delete();
		}else {
			System.out.println("file not exist");
			f.createNewFile();
		}
		

//		File f=new File("E:\mini project");
//		if(f.exists()) {
//			System.out.println("Directory exist");
//			String names[]=f.list();
//			for(String n:names) {
//				System.out.println(n);
//			}
//		}else {
//			System.out.println("Directory not exist");
//			f.mkdir();
//		}
	}
}