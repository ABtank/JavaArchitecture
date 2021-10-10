package Facade;

public interface TransactionService {
    boolean transferMoney(String fromCard, String toAccount, int sum);
}
