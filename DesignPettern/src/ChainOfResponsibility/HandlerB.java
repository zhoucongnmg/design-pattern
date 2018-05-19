package ChainOfResponsibility;

public class HandlerB extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 2) {
            System.out.println("HandlerB处理级别2的请求");
            return true;
        }

        return false;
    }

}
