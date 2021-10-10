package Facade;

public interface PaymentFacade {

    boolean pay(String clientName, String fromCard, String toAccount, int amount);

    boolean withdrawMoney(String card, int amount);
}
