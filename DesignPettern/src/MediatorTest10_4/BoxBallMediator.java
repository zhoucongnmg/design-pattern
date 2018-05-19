package MediatorTest10_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BoxBallMediator {

	protected Map<Ball, Box> tubToMachine = new HashMap<>();
	
	public Set<Ball> getTubs(Box m){
		Set<Ball> set = new HashSet<Ball>();
		for (Map.Entry<Ball, Box> e : tubToMachine.entrySet()) {
			if(e.getValue().equals(m)) {
				set.add(e.getKey());
			}
		}
		return set;
	}
	
	public Box getMachine(Ball t){
		return tubToMachine.get(t);
	}
	
	public void set(Ball t, Box m){
		tubToMachine.put(t, m);
	}
}
