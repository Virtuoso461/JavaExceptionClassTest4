package Test;
import java.io.*;
import java.util.Scanner;
public class ClassTest2 {
	public static void main(String[] args) {
		File file =new File("D:\\Test.txt");
		FileInputStream in =null;
		FileOutputStream out =null;
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入学号:");
			String str =sc.nextLine();
			System.out.println("请输入姓名");
			String str1=sc.nextLine();
			byte b[]=str.getBytes();
			byte a[]=str1.getBytes();
			out =new FileOutputStream(file);
			for(int i=0;i<b.length;i++) {
				out.write(b[i]);
			}
			out.write("\r\n".getBytes());
			for(int i=0;i<a.length;i++) {
				out.write(a[i]);
			}
			in =new FileInputStream(file);
			String content;
			int size;
			byte c[]=new byte[1024];
			while((size=in.read(c))!=-1) {
				content =new String(c,0,size);
				System.out.println(content);
			}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if(in!=null) {
			try {
				in.close();
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}
		if(out!=null) {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
  }
}
