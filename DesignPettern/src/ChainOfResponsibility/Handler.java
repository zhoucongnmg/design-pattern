package ChainOfResponsibility;

public abstract class Handler {

    /*
     * ֱ�Ӻ�̣����ڴ�������
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
                System.out.println("�ü����޷�����");
                return false;
            }
        }
    }

    /*
     * ��������
     */
    public abstract boolean handlerRequest(int level);
}
