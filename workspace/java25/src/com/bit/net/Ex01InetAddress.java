package com.bit.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01InetAddress {
	// ��Ż��� ��� �͵��� �ּҸ� ������ �ְ� �ּҸ� ���� ����, ������ ������.
	// ���� ��Ģ�����δ� ����� ã������ �� �ּҸ� ã�� �� �ּҸ� �Է��ؼ� ����,�����ؾ��Ѵ�.
	// ������ DNS(Domain Name System)�� ���ؼ� ������ �ּҸ� ������� �ʰ� Domain�� ����ص� ������ ���̴�.
	// �Ϲ������� ��Ʈ��ũ ������ ������ DNS�� �ּҰ� ��ŷ�Ǿ� �ְ� DNS�� ã�����ϴ� ������ ��ȯ�޴´�.
	// DNS�� ���� �������� ���� ������ ������ �� �ִ� IP�ּҸ� ��ȯ���ش�.
	// DNS�� �� ��Ż纰�� �����Ǿ��ִ� ��찡 ��ټ�.
	// DNS�� ���� �Է��� ������ ������ IP�ּҸ� ã�� ��ȯ�ؼ� ��ȯ�� �ּҸ� ������ ���� ����Ʈ�� ������ �� �ִ� ��.
	// ���� �츮�� ����ϴ� IPv4�� 2000��� �ʹݿ� ��� ����� ���ȴ�. 256*256*256*256
	// ���� �ֱٿ��� IPv6�� ����ϵ��� �����ϰ� ������ �Ϲ������� ������ �ʰ� �ִ�.(16���� ���)

	
	public static void main(String[] args) {
		InetAddress addr1 = null;
		InetAddress[] addr2 = null;
		try {
			// �̶��� IO�̱� ������ ����ó���� ������.
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
//		// ȣ��Ʈ�̸�
//		System.out.println(addr1.getHostName());
//		// ȣ��Ʈ �ּ� (���ǥ��) = IP�ּ� 1byte.1byte.1byte.1byte �� 4����Ʈ.
//		System.out.println(addr1.getHostAddress());
//		// ĳ�δ��� ȣ��Ʈ �ּ�
//		System.out.println(addr1.getCanonicalHostName());
//		// ���� IP �ּ������� 0~256�� �ƴ� -128 ~ 127 ���� ǥ�� ���� ��.
//		byte[] arr = addr1.getAddress(); // ��ȯ�� byte[]
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
// www ������ �ʾ��� ��(4��)	// www�� �ٿ��� ��(2��)
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