package MediatorTest10_4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void test() {
        BoxBallMediator mediator = new BoxBallMediator();
        Ball t = new Ball("T304", mediator);
        Box m1 = new Box("1001", mediator);
        Box m2 = new Box("1002", mediator);

        t.setLocation(m1);
        assertTrue(m1.getBalls().contains(t));
        assertFalse(m2.getBalls().contains(t));

        t.setLocation(m2);
        assertTrue(m2.getBalls().contains(t));
        assertFalse(m1.getBalls().contains(t));
    }

}
