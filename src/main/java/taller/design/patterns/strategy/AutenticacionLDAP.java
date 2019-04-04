package taller.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutenticacionLDAP extends AutenticationLDAPService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutenticacionLDAP.class);

    @Override
    protected boolean validate(String login, String clave) {
        LOGGER.info("Autenticacion en el LDAP: {}", GROUP_NAME);
        return login.equals(clave);
    }
}
