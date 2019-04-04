package taller.design.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckingAccount implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckingAccount.class);

    @Override
    public void openAccount(Account account) {
        LOGGER.info("Se Aperturo la cuenta corriente de: {}", account.getName());
    }
}
