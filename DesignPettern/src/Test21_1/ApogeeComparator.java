package Test21_1;

import java.util.Comparator;

public class ApogeeComparator implements Comparator<Rocket>{

	@Override
	public int compare(Rocket o1, Rocket o2) {
		return o1.getApogee().compareTo(o2.getApogee());
	}
	
}
