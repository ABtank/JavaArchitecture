package behavioral.chain_of_responsibility;

public class StarterHandler extends AbstractHandler {
    @Override
    public void handle(Context ctx, Request request) {
        System.out.printf("Message %s has received\n", request.getMessage());
        super.handle(ctx, request);
    }
}
