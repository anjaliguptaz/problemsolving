

public class EaseTheArray {
	
	public static void main(String args[]){
		int[] num ={2, 2, 0, 4, 0, 8};
		easeArray(num);
		System.out.println( "New Array");
		int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
		easeArray(arr);
		System.out.println( "New Array111");
		int arr1[] = {2, 2, 0 ,4 ,4};
		easeArray(arr1);
		
		System.out.println( "New Array222");
		int arr2[] = {0, 1, 2 ,2 ,0};
		easeArray(arr2);
	}
	
	public static void easeArray(int[] num){
		int[] reuslt= new int[num.length];
		for (int i = 0, j = 1; i < num.length - 1; i++, j++) {
			if (num[i] != 0 && num[i] == num[j]) {
				num[i] = 2*num[i];
				num[j] =0;
			}
		}

		for (int k = 0,j=0; k < num.length; k++) {
			if(num[k] !=0){
				//swap it with last zero indexed number
				reuslt[j] =num[k];
				j++;
			}			
		}		
		for (int k = 0; k < reuslt.length; k++) {
			System.out.println( reuslt[k]);
		}
		
	}

}
