package AdapterTest3_1;

/**
 * ½Ó¿ÚÊÊÅäÆ÷
 * @author zc
 *
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim {

	private double time;
	public OozinozRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
	}

	@Override
	public double getMass() {
		return getMass(this.time);
	}

	@Override
	public double getThrust() {
		return getThrust(this.time);
	}

	@Override
	public void setSimTime(double t) {
		this.time = t;
	}

}
