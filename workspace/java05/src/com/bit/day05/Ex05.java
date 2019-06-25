class Ex05{

    public static void main(String[] args) {
	float a = 3.14f; //3.14라는 숫자 자체가 double을 의미하기 때문에 강제 형 변환.
                         //3.14를 3.14f로 하여 플롯형으로 바꿔줄 수 있다
	System.out.println(a);
	//System.out.println((char)97);
	//int b = 2147483648; //상수가 int형의 맥시멈 값을 넘었기 때문에 오류 발생
	long b = 2147483648l; //상수가 long형으로 형 변환시켜줌
	System.out.println(b);

	int c = 2147483647; //int형의 맥시멈값.
	c++; //맥시멈값에서 1 증가
	System.out.println(c); // -2147483647출력이 됨.
	System.out.println("----------------------------------------------------------------------");
    
	byte d = 127;
	//d = (byte)(d + 10); // +10에서 10이란 값이 인트값을 가지고 있으므로 대입연산자의 오른쪽은 인트값이 되어버린다.
        d++;                  // 따라서 저 값의 자료형을 변환시켜줘야한다. 쓸일 없으므로 쓰지말자ㅎㅎ;
	System.out.println(d);
    }

}