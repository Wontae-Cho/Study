package com.bit.pm;

public class Ex08nonstatic {
	static int su1=1111;
	int su2=2222;
	
	class Inner04{
		// ����Ŭ������ non-static �� ��, �ٱ�Ŭ������ ������ ��� ��Ӱ� ������ ȿ���� ���δ�.
		// �ֳ��ϸ� �ٱ�Ŭ������ ����Ŭ������ ���ΰ� �ֱ� �����̴�.
		void func03(){
			System.out.println(su1);
			System.out.println(su2);
			func01(); 
			func02(); //�θ� ���� func02�ε��� �ұ��ϰ� ��ġ ��ӹ����� ó�� ��밡��.
			
		}
	}
	
	static void func01(){
		
	}
	void func02(){
		
	}

	public static void main(String[] args) {


	}

}
