package make.pos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Table implements Serializable{
	//테이블은 각각의 번호를 갖고 있음. 번호를 위치가 지정되어있으며 바뀌면 안된다.
	private int[] tabNum ;
	private int price ;		//각 테이블이 계산해야 할 값
	
	public Table() { //생성할 때 테이블번호를 가져가도록.
		for(int i=1; i<=20; i++){
			getTabNum()[i] = i;	
		}
		
	}
	public void pork(){
		this.setPrice(this.getPrice() + 30000);
	}
	public void beef(){
		this.setPrice(this.getPrice() + 68000);
	}
	public void alcohol(){
		this.setPrice(this.getPrice() + 4000);
	}
	public void beverage(){
		this.setPrice(this.getPrice() + 2000);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int[] getTabNum() {
		return tabNum;
	}
	public void setTabNum(int[] tabNum) {
		this.tabNum = tabNum;
	}
	
	
}


public class PointOfSale {
	//load 데이터 = read = input 
	static File file = new File("data\\sales.obj");
	static List<Table> list = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String target = "";
		Table table = null;
		load();
		
		int[] count = table.getTabNum();
		
		while(true){
			System.out.print("(1)신규주문 / (2)추가주문 / (3)계산 >");
			input = sc.nextLine();
			if(input.equals("1")){
				//이용가능한 테이블 확인
				int temp = 0;
				System.out.println("테이블은 총 20개이며 현재 이용가능한 테이블은");
				for(int i=0; i<count.length; i++){
					if(count[i]==0){
						System.out.print(count[i]+1+"번 ");
						temp++;
					}
				}
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("메뉴를 선택해주세요.");
				System.out.print("1.소고기 2.돼지고기 ");
				input = sc.nextLine();
				if(input.equals("1")){	
					System.out.print("몇판을 주문하시겠습니까? (한판 = 550g)");
					input = sc.nextLine();
					int amount = Integer.parseInt(input);
					for(int i=0; i<amount; i++){
						table.beef();
					}
				}else if(input.equals("2")){
					System.out.print("몇판을 주문하시겠습니까? (한판 = 550g)");
					input = sc.nextLine();
					int amount = Integer.parseInt(input);
					for(int i=0; i<amount; i++){
						table.pork();
					}
				}
			}
		}
		
//		while(true){ //테이블 갯수는 20개. 번호는 1 ~ 20;
//			
//			System.out.print("테이블 번호를 입력해주세요>");
////			System.out.print("계산은 0번을 눌러주세요>");
//			target=sc.nextLine();
////			if(target.equals("0")){
////				System.out.println("계산하실금액은 "+table.getPrice()+"원 입니다.");
////				System.out.println("이용해주셔서 감사합니다.");
////				save();
////				break;
////			}
//			int tempNum = Integer.parseInt(target);
//			if(count[tempNum-1]==0){ //테이블이 비어있을경우.
//				table = new Table(tempNum); 
//				count[tempNum-1] = 1;
//			}else if(count[tempNum-1]!=0){
//				System.out.println("이미 사용중인 곳입니다.");
//				continue;
//			}
//			
//		}
		

	}//main end
	
	public static void load(){
		InputStream is = null;			// 읽어들여야 하니까 인풋스트림.
		ObjectInputStream ois = null;	// 객체를 읽어야하니까 인풋스트림에 Object를 끼워넣어.
		try {
			//실제로 데이터의 읽기가 이뤄지는 부분.
			file.createNewFile(); // 없어서 만들었어.
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			list = (List<Table>)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			if (list == null) {
				list = new ArrayList<Table>();
			} // 스캐너가 고장나면 새로운 객체를 대입해주듯이 같은 원리임.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null){ois.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void save(){//저장하는기능. 써야해. output
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}
		
}//class end
