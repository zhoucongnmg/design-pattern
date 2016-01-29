package Test10_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TubMediator {

	protected Map<Tub,Machine> tubToMachine = new HashMap<Tub,Machine>();
	
	public Set<Tub> getTubs(Machine m){
		Set<Tub> set = new HashSet<Tub>();
		for (Map.Entry<Tub, Machine> e : tubToMachine.entrySet()) {
			if(e.getValue().equals(m))
				set.add(e.getKey());
		}
		return set;
	}
	
	public Machine getMachine(Tub t){
		return tubToMachine.get(t);
	}
	
	public void set(Tub t,Machine m){
		tubToMachine.put(t, m);
	}
}
