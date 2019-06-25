package lecture14;

class Car{
	int gasolineGauge; //���ָ� �ܿ���
	
	public Car(int oil){
		this.gasolineGauge = oil; 
	}
}

class HybridCar extends Car{ //���̺긮�� �ڵ���
	int electricGauge; //���� ���͸� �ܿ���
	
	public HybridCar(int oil,int elec){
		super(oil);
		this.electricGauge = elec;
	}
}
class HybridWaterCar extends HybridCar{ //���̺긮�� ����ī
	int waterGauge; // ������ ��ȯ�� ���� �ܿ���
	
	public HybridWaterCar(int oil, int elec, int waterGauge){
		super(oil,elec);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge(){
		System.out.println("�ܿ� ���ָ� : "+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : "+electricGauge);
		System.out.println("�ܿ� ���ͷ� : "+waterGauge);
	}
	
	
}

public class Inherit {

	public static void main(String[] args) {
		HybridWaterCar me = new HybridWaterCar(5,9,10);
		me.showCurrentGauge();
		
		HybridWaterCar you = new HybridWaterCar(4,4,6);
		me.showCurrentGauge();
		


	}

}
