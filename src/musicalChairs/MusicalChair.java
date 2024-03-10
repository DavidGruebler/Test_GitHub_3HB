package musicalChairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicalChair {
	
	private List<String> names;
	
	public MusicalChair(String... names) {
		//String... kann belibig viele Strings übernehmen
		//Java regelt das inters mit einem Array
		//dadurch wird lenght und nicht sice verwendet!
		if(names.length>0) {
			//Array.asList(names) - wandelt ein Array in eine Liste um
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}
	

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp=tmp + itr.next()+ ", ";
		}
		return tmp;
	}
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
	}
	
	public void rotateAndRemove(int distance) {
		this.rotate(distance);
		((LinkedList<String>) this.names).removeLast();
	}
	
	public String playGame() {
		
		while(this.names.size() > 1) {
			int num = ThreadLocalRandom.current().nextInt();
			rotateAndRemove(num);
			System.out.println("Im rennen sind noch: "+ this.toString());
			
		}
		System.out.println("Der Gewinner ist:"+this.toString());
		return this.toString();
	}

}
