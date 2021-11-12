import java.util.*;
public class Random_value {
	public static void main(String[] args) {
		HashMap<Integer, Double> randommap = new HashMap<>();
		Random rm = new Random();
		
		for(int i=0; i<10; i++) {
			int in = rm.nextInt();
			double dm = rm.nextDouble();
			randommap.put(in, dm);
		}
		for(Map.Entry<Integer, Double> m: randommap.entrySet()) {
			System.out.println("Key: "+m.getKey()+" "+"  Value:"+m.getValue());
		}
		
	}

}
