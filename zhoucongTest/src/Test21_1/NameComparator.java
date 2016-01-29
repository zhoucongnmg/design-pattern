package Test21_1;

import java.util.Comparator;

public class NameComparator implements Comparator<Rocket>{

	@Override
	public int compare(Rocket o1, Rocket o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
