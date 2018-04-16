

public class ReverseNumber {

	int an;
	
	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public static void main(String[] args) {
		int num =12345;
		int reverse =0;
		while(num !=0){
			reverse = reverse*10+ num %10;
			num= num/10;
		}
 System.out.println("Num:"+reverse);
	}

}
