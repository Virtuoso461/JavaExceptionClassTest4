package Test;
import java.io.*;
import java.util.*;
public class ClassTest3 {
	public static void main(String[] args) {
		File file = new File("D:\\Test.txt");
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw = new FileWriter(file);
			fr = new FileReader(file);
			Scanner sc =new Scanner(System.in);
			System.out.println("«Î ‰»Î“ª¥Æ”¢Œƒ:");
			String str =sc.nextLine();
			fw.write(str);
			fw.close();
			int size;
			while((size=fr.read())!=-1) {
				System.out.print((char)size);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
