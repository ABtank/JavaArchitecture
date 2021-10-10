package behavioral.mediator;

public class Button extends Widget {

    private String buttonName;

    public Button(Mediator mediator, String buttonName) {
        super(mediator);
        this.buttonName = buttonName;
    }

    public void clickButton() {
        System.out.println("button " + buttonName + " clicked");
        changed();
    }

}
