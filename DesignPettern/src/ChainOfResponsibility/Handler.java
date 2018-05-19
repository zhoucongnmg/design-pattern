package ChainOfResponsibility;

public abstract class Handler {

    /*
     * 直接后继，用于传递请求
     */
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean doHandle(int level) {
        if (handlerRequest(level)) {
            return true;
        } else {
            if (nextHandler != null) {
                return nextHandler.doHandle(level);
            } else {
                System.out.println("该级别无法处理");
                return false;
            }
        }
    }

    /*
     * 处理请求
     */
    public abstract boolean handlerRequest(int level);
}
