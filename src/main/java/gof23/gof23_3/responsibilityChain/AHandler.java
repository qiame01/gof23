package gof23.gof23_3.responsibilityChain;

public class AHandler extends Handler {

    public AHandler(String name, int handlerLevel) {
        super(name, handlerLevel);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestLevel() == 1) {
            System.out.println(String.format("职级为%s的领导AHandler 审批通过：员工%s,由于%s,请假%s天,请求等级为%s",
                    this.handlerLevel, request.getName(), request.getReason(), request.getDays(), request.getRequestLevel()));
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            }
        }
    }
}
