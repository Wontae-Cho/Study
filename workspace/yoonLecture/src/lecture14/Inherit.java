package lecture14;

class Car{
	int gasolineGauge; //가솔린 잔여량
	
	public Car(int oil){
		this.gasolineGauge = oil; 
	}
}

class HybridCar extends Car{ //하이브리드 자동차
	int electricGauge; //전기 배터리 잔여량
	
	public HybridCar(int oil,int elec){
		super(oil);
		this.electricGauge = elec;
	}
}
class HybridWaterCar extends HybridCar{ //하이브리드 워터카
	int waterGauge; // 에너지 전환용 물의 잔여량
	
	public HybridWaterCar(int oil, int elec, int waterGauge){
		super(oil,elec);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge(){
		System.out.println("잔여 가솔린 : "+gasolineGauge);
		System.out.println("잔여 전기량 : "+electricGauge);
		System.out.println("잔여 워터량 : "+waterGauge);
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
