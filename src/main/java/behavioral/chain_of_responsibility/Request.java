package behavioral.chain_of_responsibility;

public class Request {
    private String password;
    private String message;

    public Request(String password, String message) {
        this.password = password;
        this.message = message;
    }

    public String getPassword() {
        return password;
    }

    public String getMessage() {
        return message;
    }
}
