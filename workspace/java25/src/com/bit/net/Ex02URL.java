package com.bit.net;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * tcp/ip 
 * Transmission Control Protocol (tcp)
 * 포트에는 눈에 보이는 포트와 보이지 않는 포트가 있다.
 * 보이는 포트는 일반적으로 컴퓨터에 슬롯이라고 생각하면 된다.
 * 보이지 않는 포트는 컴퓨터, 사이트 등에 접속할 수 있는 창구라고 보면 된다.
 * ---------------------------
 * 20 : FTP(data)			  | 	0번 ~ 1023번: 잘 알려진 포트 (well-known port)
 * 21 : FTP(제어)			  |		1024번 ~ 49151번: 등록된 포트 (registered port)
 * 22 : SSH					  |		49152번 ~ 65535번: 동적 포트 (dynamic port)
 * 23 : 텔넷				  |		World Wide Wep = www
 * 53 : DNS					  |		외국에서 접속할 때는 적어줘야 알 수 있음.
 * 80 : 월드 와이드 웹 HTTP	  |
 * 119 : NNTP				  |
 * 443 : TLS/SSL 방식의 HTTP  |
 * ---------------------------
 * http = 암호화 되지 않은 데이터처리. ex) 엽서
 * https = 암호화 한 데이터처리를 진행하는 프로토콜. ex) 편지
 */


public class Ex02URL {

	public static void main(String[] args) {
		// 주소를 가져옴
//		String msg = "https://www.google.com/search?ei=S-vHXL4Ww4SgBI_ni-gI&q=java&oq=java&gs_l=psy-ab.3..35i39l2j0i67j0j0i67j0i131i67j0i67l4.67588.70474..70899...1.0..0.110.414.1j3......0....1..gws-wiz.....6..0i71j0i131.uJu8GraIECo";
		String msg = "http://www.seoul.go.kr/main/index.jsp";
		URL url=null;
		
		try {
			url = new URL(msg);
			
			//이들이 종합된게 주소.
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
