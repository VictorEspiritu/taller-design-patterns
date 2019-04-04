package taller.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(Strategy.class);

    public static void main(String[] args) {

        LOGGER.info("Start Demo...");
        AutenticationContext context;

        context = new AutenticationContext(new AutenticacionOAUTH());
        context.autenticar("victor", "11235813");

        context = new AutenticationContext(new AutenticacionBD());
        context.autenticar("Erick", "1123581321");

        context = new AutenticationContext(new AutenticacionLDAP());
        context.autenticar("Erick", "112358132134");

    }
}
