package com.bit.net;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * tcp/ip 
 * Transmission Control Protocol (tcp)
 * ��Ʈ���� ���� ���̴� ��Ʈ�� ������ �ʴ� ��Ʈ�� �ִ�.
 * ���̴� ��Ʈ�� �Ϲ������� ��ǻ�Ϳ� �����̶�� �����ϸ� �ȴ�.
 * ������ �ʴ� ��Ʈ�� ��ǻ��, ����Ʈ � ������ �� �ִ� â����� ���� �ȴ�.
 * ---------------------------
 * 20 : FTP(data)			  | 	0�� ~ 1023��: �� �˷��� ��Ʈ (well-known port)
 * 21 : FTP(����)			  |		1024�� ~ 49151��: ��ϵ� ��Ʈ (registered port)
 * 22 : SSH					  |		49152�� ~ 65535��: ���� ��Ʈ (dynamic port)
 * 23 : �ڳ�				  |		World Wide Wep = www
 * 53 : DNS					  |		�ܱ����� ������ ���� ������� �� �� ����.
 * 80 : ���� ���̵� �� HTTP	  |
 * 119 : NNTP				  |
 * 443 : TLS/SSL ����� HTTP  |
 * ---------------------------
 * http = ��ȣȭ ���� ���� ������ó��. ex) ����
 * https = ��ȣȭ �� ������ó���� �����ϴ� ��������. ex) ����
 */


public class Ex02URL {

	public static void main(String[] args) {
		// �ּҸ� ������
//		String msg = "https://www.google.com/search?ei=S-vHXL4Ww4SgBI_ni-gI&q=java&oq=java&gs_l=psy-ab.3..35i39l2j0i67j0j0i67j0i131i67j0i67l4.67588.70474..70899...1.0..0.110.414.1j3......0....1..gws-wiz.....6..0i71j0i131.uJu8GraIECo";
		String msg = "http://www.seoul.go.kr/main/index.jsp";
		URL url=null;
		
		try {
			url = new URL(msg);
			
			//�̵��� ���յȰ� �ּ�.
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
