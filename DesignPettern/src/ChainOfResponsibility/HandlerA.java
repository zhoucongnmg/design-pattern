package ChainOfResponsibility;

public class HandlerA extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 1) {
            System.out.println("HandlerA处理级别1的请求");
            return true;
        }
        return false;
    }

}
