package com.bit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;

public class Ex06 {

	
	public static void main(String[] args) {
		File file = new File("files\\ex06.txt");
		Reader fr = null;
		StreamTokenizer stoken = null;
		
		try {
			fr=new FileReader(file);
			stoken = new StreamTokenizer(fr);
			while(true){
				int su = stoken.nextToken();
				if(su==StreamTokenizer.TT_EOF){break;} //끝(-1)
				switch (stoken.ttype) {
				case StreamTokenizer.TT_WORD:
					System.out.println(stoken.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println(stoken.nval);
					break;
				default:
					System.out.println((char)stoken.ttype);
					break;
				}
//				int su = stoken.nextToken();
//				if(su==StreamTokenizer.TT_EOF){break;} //끝(-1)
//				if(stoken.ttype == StreamTokenizer.TT_WORD){ //문자열(-3)
//					System.out.println(stoken.sval);
//				}else if(stoken.ttype == StreamTokenizer.TT_NUMBER){ //숫자(-2)
//					System.out.println(stoken.nval);
//				}else{
//					System.out.println((char)stoken.ttype); //숫자도 문자도 아닌경우.
//				}
			}
//			int su = stoken.nextToken();
//			System.out.println(su+":"+stoken.ttype+":"+stoken.sval); //string value
//			su = stoken.nextToken();
//			System.out.println(su+":"+stoken.ttype+":"+stoken.nval); //number value
//			su = stoken.nextToken();
//			System.out.println(su+":"+stoken.ttype+":"+stoken.nval);
//			su = stoken.nextToken();
//			System.out.println(su+":"+stoken.ttype+":"+(char)stoken.ttype);
//			su = stoken.nextToken();
//			System.out.println(su+":"+stoken.ttype+":"+(char)stoken.ttype);
//			su = stoken.nextToken();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
