package taller.design.patterns.decorator;

public  abstract  class AccountDecorator implements AccountService{

    protected AccountService accountService;

    public AccountDecorator(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void openAccount(Account account) {
        this.accountService.openAccount(account);
    }
}
