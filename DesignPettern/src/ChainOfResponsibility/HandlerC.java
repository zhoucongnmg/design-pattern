package ChainOfResponsibility;

public class HandlerC extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 3) {
            System.out.println("HandlerC������3������");
            return true;
        }

        return false;
    }

}
