package behavioral.chain_of_responsibility;

public class UpperCaseHandler extends AbstractHandler{
    @Override
    public void handle(Context ctx, Request request) {
        System.out.println("Message handled");
        ctx.setData(request.getMessage().toUpperCase());
        super.handle(ctx, request);
    }
}
