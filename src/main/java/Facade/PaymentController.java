package Facade;

public class PaymentController {

    private PaymentFacade paymentFacade;

//    @PostRequest()
    public void pay(String client, String fromCard, String toAccount, int amount){
        paymentFacade.pay(client, fromCard, toAccount, amount);
        Boolean.valueOf("true");
    }



//    @PostRequest()
    public void withdrawMoney(String fromCard, int amount){
        paymentFacade.withdrawMoney(fromCard, amount);
    }
}
