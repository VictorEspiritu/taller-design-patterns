package taller.design.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Decorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Decorator.class);

    public static void main(String[] args) {

        LOGGER.info("Start Demo...");

        AccountService myServicio = new SavingAccount();
        AccountService accountService = new InsurranceDecorator(myServicio);

        accountService.openAccount(new Account(123, "Erick"));
    }
}
