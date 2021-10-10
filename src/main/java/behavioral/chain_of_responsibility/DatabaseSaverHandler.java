package behavioral.chain_of_responsibility;

public class DatabaseSaverHandler extends AbstractHandler{
    @Override
    public void handle(Context ctx, Request request) {
        System.out.printf("Message %s saved to database\n", ctx.getData());
        super.handle(ctx, request);
    }
}
