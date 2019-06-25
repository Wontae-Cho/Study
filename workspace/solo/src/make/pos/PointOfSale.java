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
	//���̺��� ������ ��ȣ�� ���� ����. ��ȣ�� ��ġ�� �����Ǿ������� �ٲ�� �ȵȴ�.
	private int[] tabNum ;
	private int price ;		//�� ���̺��� ����ؾ� �� ��
	
	public Table() { //������ �� ���̺��ȣ�� ����������.
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
	//load ������ = read = input 
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
			System.out.print("(1)�ű��ֹ� / (2)�߰��ֹ� / (3)��� >");
			input = sc.nextLine();
			if(input.equals("1")){
				//�̿밡���� ���̺� Ȯ��
				int temp = 0;
				System.out.println("���̺��� �� 20���̸� ���� �̿밡���� ���̺���");
				for(int i=0; i<count.length; i++){
					if(count[i]==0){
						System.out.print(count[i]+1+"�� ");
						temp++;
					}
				}
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("�޴��� �������ּ���.");
				System.out.print("1.�Ұ�� 2.������� ");
				input = sc.nextLine();
				if(input.equals("1")){	
					System.out.print("������ �ֹ��Ͻðڽ��ϱ�? (���� = 550g)");
					input = sc.nextLine();
					int amount = Integer.parseInt(input);
					for(int i=0; i<amount; i++){
						table.beef();
					}
				}else if(input.equals("2")){
					System.out.print("������ �ֹ��Ͻðڽ��ϱ�? (���� = 550g)");
					input = sc.nextLine();
					int amount = Integer.parseInt(input);
					for(int i=0; i<amount; i++){
						table.pork();
					}
				}
			}
		}
		
//		while(true){ //���̺� ������ 20��. ��ȣ�� 1 ~ 20;
//			
//			System.out.print("���̺� ��ȣ�� �Է����ּ���>");
////			System.out.print("����� 0���� �����ּ���>");
//			target=sc.nextLine();
////			if(target.equals("0")){
////				System.out.println("����ϽǱݾ��� "+table.getPrice()+"�� �Դϴ�.");
////				System.out.println("�̿����ּż� �����մϴ�.");
////				save();
////				break;
////			}
//			int tempNum = Integer.parseInt(target);
//			if(count[tempNum-1]==0){ //���̺��� ����������.
//				table = new Table(tempNum); 
//				count[tempNum-1] = 1;
//			}else if(count[tempNum-1]!=0){
//				System.out.println("�̹� ������� ���Դϴ�.");
//				continue;
//			}
//			
//		}
		

	}//main end
	
	public static void load(){
		InputStream is = null;			// �о�鿩�� �ϴϱ� ��ǲ��Ʈ��.
		ObjectInputStream ois = null;	// ��ü�� �о���ϴϱ� ��ǲ��Ʈ���� Object�� �����־�.
		try {
			//������ �������� �бⰡ �̷����� �κ�.
			file.createNewFile(); // ��� �������.
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			list = (List<Table>)ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			if (list == null) {
				list = new ArrayList<Table>();
			} // ��ĳ�ʰ� ���峪�� ���ο� ��ü�� �������ֵ��� ���� ������.
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
	public static void save(){//�����ϴ±��. �����. output
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
