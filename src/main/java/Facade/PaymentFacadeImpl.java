package Facade;

public class PaymentFacadeImpl implements PaymentFacade {

    private CheckService checkService;
    private AccountService accountService;
    private TransactionService transactionService;

    public PaymentFacadeImpl(CheckService checkService, AccountService accountService, TransactionService transactionService) {
        this.checkService = checkService;
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    @Override
    public boolean pay(String clientName, String fromCard, String toAccount, int amount) {
        checkService.checkClient(clientName);
        int accountAmount = accountService.getAccountAmount(fromCard);
        if(accountAmount >= amount){
            transactionService.transferMoney(fromCard, toAccount, amount);
            return true;
        } else {
            System.out.println("Недостаточно средств");
            return false;
        }
    }

    @Override
    public boolean withdrawMoney(String card, int amount) {
        checkService.checkOperation("withdraw money");
        int accountAmount = accountService.getAccountAmount(card);
        if (accountAmount >= amount){
            transactionService.transferMoney(card, null, amount);
            return true;
        } else {
            return false;
        }
    }
}
