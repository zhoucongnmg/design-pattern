package Test5_2;

import java.util.Set;

public class Machine extends MachineComponent {

	@Override
	Integer getMachineCount() {
		return 1;
	}

	@Override
	Boolean isTree(Set<MachineComponent> visited) {
		visited.add(this);
		return true;
	}

}
