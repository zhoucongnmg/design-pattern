package AbstractFactory;

public class FactoryA implements AbstractFactory{

	@Override
	public Computer getComputer() {
		return new ComputerA();
	}

	@Override
	public Phone getPhone() {
		return new PhoneA();
	}

}
