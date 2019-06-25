package lecture13;

public class ArrayAndMethod {
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{9,3,5,7,1};
		
		System.out.println("최소값 : "+minValue(arr));
		System.out.println("최대값 : "+maxValue(arr));

	}
	public static int minValue(int[] arr){
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		return arr[0];
	}
	public static int maxValue(int[] arr){
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		return arr[0];
	}

}
