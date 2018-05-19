package ChainOfResponsibility;

public class HandlerC extends Handler {

    @Override
    public boolean handlerRequest(int level) {
        if (level == 3) {
            System.out.println("HandlerC处理级别3的请求");
            return true;
        }

        return false;
    }

}
