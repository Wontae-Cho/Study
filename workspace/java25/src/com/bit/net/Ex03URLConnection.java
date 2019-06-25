package com.bit.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class Ex03URLConnection {

	public static void main(String[] args) {
		String str = "http://www.seoul.go.kr/main/index.jsp";
		URL url = null; 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			url = new URL(str);
			//urlĿ�ؼ� ��ü�� ����
			URLConnection conn = url.openConnection();

			conn.connect();			//������ ����
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = null;	// �� ũ�Ѹ� (�����ؿ��°�. ������)
								// �Ժη� ���� �ҹ���.
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
			
//			String type = conn.getContentType();
//			int size = conn.getContentLength();	// ũ��
//			System.out.println(type);
//			System.out.println(size+"byte");
//			Map head = conn.getHeaderFields();	// ����� ����
//			Set keys = head.keySet();
//			Iterator ite = keys.iterator();
//			while(ite.hasNext()){
//				String key = (String)ite.next();
//				System.out.println(key+" :: "+head.get(key));
//			}
//			
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
