package Test5_2;

import java.util.HashSet;
import java.util.Set;

public abstract class MachineComponent {

	abstract Integer getMachineCount();
	
	abstract Boolean isTree(Set<MachineComponent> visited);
	
	Boolean isTree(){
		return isTree(new HashSet<MachineComponent>());
	}
}
