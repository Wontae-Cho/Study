package com.bit.blind;

public interface ClientData {
	final int CHAT_TIME = 20;
	final int SELECT_TIME = 10;
	
	
	String q0 = "<html> * 규칙 * <br/> 처음 2분간은 자유롭게 대화를 나눠주세요. <br/>질문은 총 5개로 구성되어 있으며<br/>각각의 질문에 대한 답을 선택할 시간은 30초<br/>서로의 답에 대해서 대화를 할 시간은 2분씩 주어집니다.<br/>답이 서로 매칭되었을 시 초록색 매칭이 되지 않았을 때는 불이들어오지 않습니다.<br/>확인을 하셨으면 아래 아무버튼이나 눌러주시면 대화가 시작됩니다.</html>";
	
	String q1 = "Q1. 아이들을 좋아한다 / 아니다";
	String q2 = "Q2. 클럽을 가는 편이다 / 아니다";
	String q3 = "Q3. 공짜로 선물받는다면 명품 / 유니크";
	String q4 = "Q4. 원나잇스탠드 괜찮다 / 아니다";
	String q5 = "Q5. 애인간의 상호 의상지적 할 수 있다 / 안 된다";
	String qSelect = "최종 선택 \n상대방이 더 대화할 마음이 있다 / 없다 ";
	
	String[] question = {q0,q1,q2,q3,q4,q5, qSelect };
	static int questionLen = question.length;
	
	
	String matchMsg = "축하합니다. 매칭에 성공하셨습니다.  자유롭게 채팅을 해보세요";
	String misMatchMsg = "안타깝습니다. 매칭에 성공하지 못했습니다. 채팅을 더이상 이어갈 수 없습니다";
	String[]  finalMsgArr = {matchMsg, misMatchMsg};	//매칭된 경우 0, 미스매칭인 경우 1
	
	
	
	

}