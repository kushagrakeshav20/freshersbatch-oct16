import java.util.*;
public class Pair1 {
	public static void main(String[] args) {
		HashMap<String, String> p = new HashMap<>();
		p.put("1", "Kushagra");
		p.put("2", "Keshav");
		p.put("3","Kundan");
		
		for(Map.Entry<String, String> M : p.entrySet()) {
			System.out.println(M.getKey()+" "+M.getValue());
		}
		
	}
}
