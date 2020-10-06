package chapter15;

import java.io.FileOutputStream;

public class FileOutputStreamTest0 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
		
		fos = new FileOutputStream("a.zip");
for(int i=0; i<5000000; i++) {
	fos.write((char)(int)Math.random()*70000);
}

	
	}catch(Exception e) {
		e.printStackTrace();
}finally {
	if(fos != null) 
		try {
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
}
		System.out.println("파일이 생성되었습니다");
}
}