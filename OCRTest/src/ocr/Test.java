package ocr;

import java.io.File;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OCR ocr=new OCR();
		 try {
			String maybe2 = new OCR().recognizeText(new  File("E:\\lala.png"), "png");
			String str = new String(maybe2.getBytes("utf-8"),"utf-8");
			System.out.println(str);
			System.out.println("**********");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		SoundServer s=new SoundServer();
//		s.playSound("E:\\111\\HOOK1.wav");
	}

}
