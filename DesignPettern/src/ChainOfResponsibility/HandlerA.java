package ChainOfResponsibility;

public class HandlerA extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 1) {
            System.out.println("HandlerA������1������");
            return true;
        }
        return false;
    }

}
