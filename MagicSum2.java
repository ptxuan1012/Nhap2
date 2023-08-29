package day2;

public class MagicSum2 {
	public static int isMagicSum2(int num) {
		int sum =0;
		if(num>0) {
				String numberStr= String.valueOf(num);
				boolean isContain = numberStr.contains("8");
				if(isContain==true) {
					sum +=num;
				}		
			}		
		
		return sum;		
	} 

}
