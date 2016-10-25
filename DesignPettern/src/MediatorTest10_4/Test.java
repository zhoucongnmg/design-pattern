package MediatorTest10_4;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		TubMediator mediator = new TubMediator();
		Tub t = new Tub("T304",mediator);
		Machine m1 = new Machine("1001",mediator);
		Machine m2 = new Machine("1002",mediator);
		
		t.setLocation(m1);
		assertTrue(m1.getTubs().contains(t));
		assertFalse(m2.getTubs().contains(t));
		
		t.setLocation(m2);
		assertTrue(m2.getTubs().contains(t));
		assertFalse(m1.getTubs().contains(t));
	}

}
