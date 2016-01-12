package Test5_2;

import java.util.List;
import java.util.Set;

public class MachineComposite extends MachineComponent {

	List<MachineComponent> components;
	
	@Override
	Integer getMachineCount() {
		Integer sum = 0;
		for (MachineComponent machineComponent : components) {
			sum+=machineComponent.getMachineCount();
		}
		return sum;
	}

	@Override
	Boolean isTree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Boolean isTree(Set<MachineComponent> s) {
		for (MachineComponent machineComponent : components) {
			if(s.contains(machineComponent))
				return false;
		}
		return true;
	}

}
