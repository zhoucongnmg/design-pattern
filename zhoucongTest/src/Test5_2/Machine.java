package Test5_2;

import java.util.Set;

public class Machine extends MachineComponent {

	@Override
	Integer getMachineCount() {
		return 1;
	}

	@Override
	Boolean isTree() {
		return null;
	}

	@Override
	Boolean isTree(Set<MachineComponent> s) {
		s.add(this);
		return true;
	}

}
