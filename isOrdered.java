//return all n digit long numbers that are ordered, meaning first digit is less than second digit which is less than nth digit
// example if n = 4; then some ordered numbers are 1234 1245 4567 etc

import java.util.ArrayList;
import static java.lang.Math.pow;  
class isOrdered {
	public static void main(String[] args) {
		isOrdered(4);
		
	}
	
	public static void isOrdered(int num) {
		
		int start = (int)pow(10,num-1);
		int end = (int)pow(10,num);
		
		A:	for (int j=start; j<end; j++) {
				String s = String.valueOf(j);
				
			B:	for(int i=0; i<num-1; i++) {
					if(s.charAt(i)<s.charAt(i+1))
					  continue B;
					else
						continue A;
		   }
				System.out.print(s + " ");
		}
	}
}
