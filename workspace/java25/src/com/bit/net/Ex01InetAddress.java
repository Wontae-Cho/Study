package com.bit.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01InetAddress {
	// 통신상의 모든 것들은 주소를 가지고 있고 주소를 통해 접속, 접근이 가능함.
	// 따라서 원칙적으로는 어떤것을 찾으려면 그 주소를 찾고 그 주소를 입력해서 접속,접근해야한다.
	// 하지만 DNS(Domain Name System)을 통해서 서버의 주소를 기억하지 않고 Domain만 기억해도 가능한 것이다.
	// 일반적으로 네트워크 설정에 가보면 DNS의 주소가 마킹되어 있고 DNS가 찾고자하는 내용을 반환받는다.
	// DNS는 나를 기준으로 가장 빠르게 접속할 수 있는 IP주소를 반환해준다.
	// DNS는 각 통신사별로 지정되어있는 경우가 대다수.
	// DNS가 내가 입력한 내용을 가지고 IP주소를 찾아 반환해서 반환한 주소를 가지고 내가 사이트에 접속할 수 있는 것.
	// 현재 우리가 사용하는 IPv4는 2000년대 초반에 모두 사용해 버렸다. 256*256*256*256
	// 따라서 최근에는 IPv6를 사용하도록 권장하고 있으나 일반적으로 사용되지 않고 있다.(16진수 사용)

	
	public static void main(String[] args) {
		InetAddress addr1 = null;
		InetAddress[] addr2 = null;
		try {
			// 이또한 IO이기 때문에 예외처리를 수반함.
			addr1 = InetAddress.getByName("google.com");
			addr2 = InetAddress.getAllByName("www.naver.com");
//			addr2 = InetAddress.getAllByName("google.com");
			
			for(int i=0; i<addr2.length; i++){
				System.out.println(addr2[i].getHostName());
				System.out.println(addr2[i].getHostAddress());
				System.out.println(addr2[i].getCanonicalHostName());
				System.out.println("-----------------------------");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		// 호스트이름
//		System.out.println(addr1.getHostName());
//		// 호스트 주소 (양수표현) = IP주소 1byte.1byte.1byte.1byte 총 4바이트.
//		System.out.println(addr1.getHostAddress());
//		// 캐로니컬 호스트 주소
//		System.out.println(addr1.getCanonicalHostName());
//		// 같은 IP 주소이지만 0~256이 아닌 -128 ~ 127 에서 표현 했을 때.
//		byte[] arr = addr1.getAddress(); // 반환이 byte[]
//		System.out.println(Arrays.toString(arr));
	}

}


/*
 * google.com
 * 172.217.161.174 (0~256)
 * hkg07s29-in-f14.1e100.net
 * [-84, -39, 25, 14] (-128 ~ 127)
 * 
 * naver.com
 * 210.89.160.88
 * 210.89.160.88
 * [125, -47, -34, -115]
 */
// www 붙이지 않았을 때(4개)	// www를 붙였을 때(2개)
/* naver.com					// www.naver.com		
 125.209.222.142				// 125.209.222.142
 125.209.222.142				// 125.209.222.142
 -------------------------------------------------
 naver.com(local ip)			// www.naver.com
 210.89.164.90					// 125.209.222.141
 210.89.164.90					// 125.209.222.141
 --------------------------------------------------
 naver.com(local ip)
 210.89.160.88
 210.89.160.88
 -----------------------------
 naver.com
 125.209.222.141
 125.209.222.141
 -----------------------------
 
 */