package behavioral.chain_of_responsibility;

public class AuthHandler extends AbstractHandler {

    private String correctPassword;

    public AuthHandler(String correctPassword) {
        this.correctPassword = correctPassword;
    }

    @Override
    public void handle(Context ctx, Request request) {
        if(request.getPassword().equals(correctPassword)) {
            System.out.println("Password is correct!");
            super.handle(ctx, request);
        } else {
            throw new IllegalArgumentException("Password is incorrect!");
        }
    }
}
