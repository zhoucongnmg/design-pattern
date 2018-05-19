package ChainOfResponsibility;

public class HandlerD extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 4) {
            System.out.println("HandlerD处理级别4的请求");
            return true;
        }

        return false;
    }

}
