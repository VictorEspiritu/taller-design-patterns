package taller.design.patterns.decorator;

public class InsurranceDecorator extends AccountDecorator  {

    public InsurranceDecorator(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void openAccount(Account account) {
        this.accountService.openAccount(account);
        this.addInssurace();
        this.addRate();
    }

    private void addRate() {

    }

    private void addInssurace() {
        
    }
}
