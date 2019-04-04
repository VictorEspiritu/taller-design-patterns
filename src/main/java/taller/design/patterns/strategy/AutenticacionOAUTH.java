package taller.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutenticacionOAUTH extends AutenticationOAUTHService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutenticacionOAUTH.class);

    @Override
    protected boolean validate(int encryptData) {
        LOGGER.info("Validacion de tokens: {} ", encryptData);
        return encryptData != 11235813;
    }

    @Override
    protected int encryptData(String login, String clave) {

        LOGGER.info("Autenticacion con un server OAuth: {} ", autenticationType);
        return String.format("%s:%s:%s", login, clave, autenticationType).hashCode();
    }
}
