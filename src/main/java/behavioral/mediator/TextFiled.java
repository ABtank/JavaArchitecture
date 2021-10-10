package behavioral.mediator;

public class TextFiled extends Widget{
    private String text;

    public TextFiled(Mediator mediator, String text) {
        super(mediator);
        this.text = text;
    }

    public void fillText(String text){
        this.text = text;
        changed();
    }

    public String getText() {
        return text;
    }
}
