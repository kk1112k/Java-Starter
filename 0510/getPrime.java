
import java.util.ArrayList;

public class getPrime {
	public static void main(String[] args) {
		boolean[] numindex = new boolean[100000];
		ArrayList arr = new ArrayList();
		int bin = 2;
		
		for (int i =2; i<numindex.length;i++) {
			if (numindex[i] == false || arr.isEmpty()) {
				
				
				if (i> (2<<bin)-1) {
					arr.trimToSize();
					long sum = 0;
//					System.out.println(arr);
					for (int k =0; k<arr.size();k++) {
						sum += Long.parseLong((String) arr.get(k));
					}
					System.out.println(sum);
					
					bin++;
					arr.clear();					
				}
				String b = Integer.toBinaryString(i);
				arr.add(b);
				
				for (int j = i*2; j<numindex.length; j += i)
				{ numindex[j] = true; }
			}
		}
		
		
		
	}
}
