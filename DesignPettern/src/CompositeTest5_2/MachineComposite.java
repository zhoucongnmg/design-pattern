package CompositeTest5_2;

import java.util.List;
import java.util.Set;

public class MachineComposite extends MachineComponent {

	List<MachineComponent> componentList;
	
	@Override
	Integer getMachineCount() {
		Integer sum = 0;
		for (MachineComponent machineComponent : componentList) {
			sum+=machineComponent.getMachineCount();
		}
		return sum;
	}

	@Override
	Boolean isTree(Set<MachineComponent> visited) {
		
		visited.add(this);		
		
		for (MachineComponent machineComponent : componentList) {
			if(visited.contains(machineComponent)||!machineComponent.isTree(visited)) {
				return false;
			}
		}
		return true;
	}

}
