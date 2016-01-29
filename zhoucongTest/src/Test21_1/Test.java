package Test21_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args){
		Rocket r1 = new Rocket("Sock-it",0.8);
		Rocket r2 = new Rocket("Sprocket",1.5);
		Rocket r3 = new Rocket("Mach-it",1.1);
		Rocket r4 = new Rocket("Pocket",0.3);
		
		List<Rocket> rockets = new ArrayList<Rocket>();
		rockets.add(r1);
		rockets.add(r2);
		rockets.add(r3);
		rockets.add(r4);
		
		Collections.sort(rockets, new ApogeeComparator());
		for (Rocket rocket : rockets) {
			System.out.println(rocket);
		}
		
		Rocket[] arrays = new Rocket[]{r1,r2,r3,r4};
		
		Arrays.sort(arrays,new NameComparator());
		for (Rocket rocket : arrays) {
			System.out.println(rocket);
		}
	}
}
