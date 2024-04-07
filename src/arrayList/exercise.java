package arrayList;

import java.util.List;
import java.util.ArrayList;

public class exercise {
	
	public static void reduceToComments(List<String>lines) {
		for(int i=0; i<lines.size(); i+=3) {
			lines.remove(i);
			
		}
	}

	public static void main(String[] args) {
		
		List<String> lines = new ArrayList<String>();
		
		lines.add("A1");
		lines.add("A1");
		
		
	}

}
