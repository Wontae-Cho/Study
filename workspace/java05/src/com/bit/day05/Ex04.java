class Ex04{

    public static void main(String[] args){

	double w;
	w = 3;

	System.out.println(w); //3이 들어갔지만 내부에서 3을 double형으로 변환시켜 3.0으로 출력됨.

	char ch;
        ch = 32+65; //(char)를 앞에 붙여서 강제로 97.0을 int형으로 변환시킬 수 있다.

	System.out.println(ch);
	ch = (char)(ch+1);       //98
	System.out.println(ch);
	ch = (char)(ch+1);       //99
	System.out.println(ch);
	ch = (char)(ch+1);       //100
	System.out.println(ch);
	//ch = ch+1;               //101 
	//System.out.println(ch);

	double a = 3.14;
	int b;
	b = (int)a; //강제 형 변환
	System.out.println(b);

	System.out.println((char)97); // 97을 문자형 char로 강제 형 변환시켜 a가 출력되도록 함.

//byte(1) short(2) int(4) long(8) float(4) double(8)
// -----------------------------------> 자동 형 변환
// 강제 형 변환 <----------------------------------- 

	int c = 0;
	c = c+1;
	System.out.println(c);
	//c = c+1;
	c++;
	System.out.println(c); // (c++) 후위연산 우선 위에서 내려온 값을 그대로 쓰고 넘어갈 때 값이 증가함.
	//c = c+1;
	c++;
	System.out.println(c); // (++c) 전위연산 먼저 내려온 값을 증가시키고 연산을 함
	c--;
	System.out.println(c);
	c--;
	System.out.println(c);
	
	int su=1;
	System.out.println((++su)+(su++)+(su)+(su));
                            //2 + 2 + 3 + 3 = 10
	System.out.println(100+((2*3)/6)*100-100);

    }

}