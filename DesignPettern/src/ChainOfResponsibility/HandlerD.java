package ChainOfResponsibility;

public class HandlerD extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 4) {
            System.out.println("HandlerD������4������");
            return true;
        }

        return false;
    }

}
