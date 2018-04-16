

public class TestTWoDArray {
	static ReverseNumber reverseNumber;
	public static void main(String args[]){
		int[] num ={1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[][] reuslt= new int[num.length][3];
		for(int i=0;i<num.length-1;i++){
			for(int j=0,k=i; j<3;j++){
				if(k != num.length){
				reuslt[i][j] = num[k++];
				 System.out.print(reuslt[i][j] + "\t");
				}
			}
			System.out.println("\n");
		}
		
		if(reverseNumber == null || reverseNumber.getAn()==0){
			System.out.println("boon");
		}
		
	}
	

}


