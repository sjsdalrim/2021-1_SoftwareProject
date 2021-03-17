
public class ExecTime {

	public static void main(String[] args) {
		
		long startTime, endTime, execTime;
		int N = 1000000;
		
		System.out.println( d2x(65535) );
		
		startTime = System.nanoTime();
		
		for (int i=0; i<N; i++) {
			d2x(65535);
		}
		
		endTime = System.nanoTime();
		
		execTime = endTime - startTime;
		
		System.out.println("Execution Time in nano seconds = " + (double)(execTime/N) );
		
	}
	
	static String d2x(int n) {
		String hexStr = "";
		
		int dexNum = n;
		int digit;
		
		while (true) {
			
			digit = dexNum % 16;
			
			if (digit < 10) {
				hexStr = digit + " " + hexStr;
			} else if (digit == 10) {
				hexStr = "a" + " " + hexStr;
			} else if (digit == 11) {
				hexStr = "b" + " " + hexStr;
			} else if (digit == 12) {
				hexStr = "c" + " " + hexStr;
			} else if (digit == 13) {
				hexStr = "d" + " " + hexStr;
			} else if (digit == 14) {
				hexStr = "e" + " " + hexStr;
			} else if (digit == 15) {
				hexStr = "f" + " " + hexStr;
			}
			
			dexNum = dexNum / 16;
			
			if (dexNum == 0) {
				break;
			}
		}
		
		return hexStr;
	}
	
}
