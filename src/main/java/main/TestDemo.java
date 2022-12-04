package main;

import java.util.Random;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
	
	/**
	 * 
	 * @param valueToTest
	 * @return
	 */
	
	public int addPositive (int a, int b) {
		
		if(  a > 0 ||  b > 0 ) {
			
		}else { 
			throw new IllegalArgumentException ("Both parameters must be positive!");
		}
		return a +b;
	}
		 
		public int randomNumberSquared() {
			int ranInt = getRandomInt();
			return ranInt * ranInt;
		}

		public int getRandomInt() {
			Random random = new Random();
			return random.nextInt(10) + 1;

		}
	}
	


	
	
	
//	
//	public String leftTrim(String valueToTest) {
//	int pos = 0;
//	
//	for(; pos < valueToTest.length(); pos++) {
//		if(valueToTest.charAt(pos) != '0') {
//			break;
//		}
//	}
//	
//	String result = valueToTest.substring(pos);
//	return result.isEmpty() ? "0" : result ;
//	}
//
//}
