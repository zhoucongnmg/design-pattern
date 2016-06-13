package AbstractFactory;

public class FactoryB implements AbstractFactory{

	@Override
	public Computer getComputer() {
		return new ComputerB();
	}

	@Override
	public Phone getPhone() {
		return new PhoneB();
	}

}
