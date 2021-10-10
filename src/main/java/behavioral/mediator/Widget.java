package behavioral.mediator;

public abstract class Widget {
    private Mediator mediator;

    public Widget(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void changed(){
        mediator.widgetChanged(this);
    }
}
