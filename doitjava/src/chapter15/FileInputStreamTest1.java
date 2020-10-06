package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\yn-05\\git\\doitjava\\doitjava\\src\\chapter15\\input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			int word;
			while((word = fis.read()) != -1) {
				System.out.print((char)word);
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch (IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");

	}

}
