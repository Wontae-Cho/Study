package com.bit.blind;

public interface ClientData {
	final int CHAT_TIME = 20;
	final int SELECT_TIME = 10;
	
	
	String q0 = "<html> * ��Ģ * <br/> ó�� 2�а��� �����Ӱ� ��ȭ�� �����ּ���. <br/>������ �� 5���� �����Ǿ� ������<br/>������ ������ ���� ���� ������ �ð��� 30��<br/>������ �信 ���ؼ� ��ȭ�� �� �ð��� 2�о� �־����ϴ�.<br/>���� ���� ��Ī�Ǿ��� �� �ʷϻ� ��Ī�� ���� �ʾ��� ���� ���̵����� �ʽ��ϴ�.<br/>Ȯ���� �ϼ����� �Ʒ� �ƹ���ư�̳� �����ֽø� ��ȭ�� ���۵˴ϴ�.</html>";
	
	String q1 = "Q1. ���̵��� �����Ѵ� / �ƴϴ�";
	String q2 = "Q2. Ŭ���� ���� ���̴� / �ƴϴ�";
	String q3 = "Q3. ��¥�� �����޴´ٸ� ��ǰ / ����ũ";
	String q4 = "Q4. �����ս��ĵ� ������ / �ƴϴ�";
	String q5 = "Q5. ���ΰ��� ��ȣ �ǻ����� �� �� �ִ� / �� �ȴ�";
	String qSelect = "���� ���� \n������ �� ��ȭ�� ������ �ִ� / ���� ";
	
	String[] question = {q0,q1,q2,q3,q4,q5, qSelect };
	static int questionLen = question.length;
	
	
	String matchMsg = "�����մϴ�. ��Ī�� �����ϼ̽��ϴ�.  �����Ӱ� ä���� �غ�����";
	String misMatchMsg = "��Ÿ�����ϴ�. ��Ī�� �������� ���߽��ϴ�. ä���� ���̻� �̾ �� �����ϴ�";
	String[]  finalMsgArr = {matchMsg, misMatchMsg};	//��Ī�� ��� 0, �̽���Ī�� ��� 1
	
	
	
	

}