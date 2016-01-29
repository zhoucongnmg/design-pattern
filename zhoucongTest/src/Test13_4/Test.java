package Test13_4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Test13_4.ChemicalFactory.ChemicalImpl;

public class Test {

	@org.junit.Test
	public void test() {
		ChemicalFactory.ChemicalImpl chemical = (ChemicalImpl) ChemicalFactory.getChemical("carbon");
		assertTrue(chemical.getName().equals("Carbon"));	
		assertTrue(chemical.getSymbol().equals("C"));
	}
}
