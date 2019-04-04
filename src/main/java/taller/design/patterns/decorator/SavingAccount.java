package taller.design.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SavingAccount implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SavingAccount.class);

    @Override
    public void openAccount(Account account) {
        LOGGER.info("Se Aperturo la cuenta de: {}", account.getName());
    }
}
