package AdapterTest3_1;

//import java.awt.event.MouseAdapter;
/**
 * ∂‘œÛ  ≈‰∆˜
 * @author zc
 *
 */

public class OozinozSkyrocket extends Skyrocket {

	private PhysicalRocket _physicalRocket;
	public OozinozSkyrocket(PhysicalRocket physicalRocket) {
		super(physicalRocket.getMass(0), physicalRocket.getThrust(0),physicalRocket.getBurnTime());
		this._physicalRocket = physicalRocket;
		//MouseAdapter
	}

	@Override
	public double getMass() {
		return _physicalRocket.getMass(simTime);
	}

	@Override
	public double getThrust() {
		return _physicalRocket.getThrust(simTime);
	}
	
	
}
