package Test5_2;

import java.util.Set;

public abstract class MachineComponent {

	abstract Integer getMachineCount();
	
	abstract Boolean isTree();
	
	abstract Boolean isTree(Set<MachineComponent> s);
}
