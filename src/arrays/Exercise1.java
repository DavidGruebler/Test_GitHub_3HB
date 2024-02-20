package arrays;

public class Exercise1 {

	static int count5PercentJumps(int[]gains) {
		int jumps=0;
		if(gains == null) {
			System.err.println("Das Array darf nicht null sein");
		}else{for(int i = 0; i < gains.length-1; i++) {
				int result = ((gains[i+1]-gains[i]/gains[i])*100);
				if(result > 5) {
					jumps++;
				
				}
			}
		}
		return jumps;
	}
	
	public static void main(String[] args) {
		int[] dailyGains = {1000, 2000, 500, 9000, 9010};
		
		count5PercentJumps(dailyGains);
	
	}

}
