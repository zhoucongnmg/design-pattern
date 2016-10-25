package FlyweightTest13_4;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Chemical chemical = (Chemical) ChemicalFactory.getChemical("carbon");
		assertTrue(chemical.getName().equals("Carbon"));	
		assertTrue(chemical.getSymbol().equals("C"));
//		ChemicalImpl ci = new ChemicalFactory().new ChemicalImpl("1","2",1.1);
	}
}
