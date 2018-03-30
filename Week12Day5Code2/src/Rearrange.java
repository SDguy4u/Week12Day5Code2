





	import java.util.*;

	public class Rearrange {

	public static void main (String[] args) {
	List <String> Name =  new ArrayList();
	Name.add("Brother");
	Name.add("Saksham");
	Name.add("Sakshu");

	Collections.sort(Name);
	System.out.println(" The ascending sorted data is " + Name);
	
	Collections.reverse(Name);
	System.out.println(" The descending sorted data is " + Name);
	}
	}


