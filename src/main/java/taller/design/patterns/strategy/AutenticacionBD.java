package taller.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutenticacionBD extends AutenticationBDService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutenticacionBD.class);

    @Override
    protected boolean validate(Object connection, String login, String clave) {
        LOGGER.info("Validacion de credenciales en BD: {}", connection);
        return login.equals(clave);
    }

    @Override
    protected Object getConnection() {
        LOGGER.info("Establecemos conexion con la BD {} con timeOut {}, para la autenticacion", TYPE, timeOut);
        return new Object();
    }
}
