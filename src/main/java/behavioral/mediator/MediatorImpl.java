package behavioral.mediator;

public class MediatorImpl implements Mediator {

    private Button buttonOk;
    private TextFiled login;
    private TextFiled password;

    public void setButtonOk(Button buttonOk) {
        this.buttonOk = buttonOk;
    }

    public void setLogin(TextFiled login) {
        this.login = login;
    }

    public void setPassword(TextFiled password) {
        this.password = password;
    }

    @Override
    public void widgetChanged(Object o) {
        if (o == buttonOk){
            if (!login.getText().isEmpty() && !password.getText().isEmpty()){
                System.out.println("Process completed");
            } else {
                System.out.println("Please, fill login or password");
            }
        } else if (o == login){
            showDialogWindow();
        } else if (o == password){
            showDialogWindow();
        }
    }

    public void showDialogWindow(){
        String dialogWindow = "Dialog Window " + "\n" +
                "login = " + login.getText()  + "\n" +
                "password = " + password.getText();
        System.out.println(dialogWindow);
    }
}
