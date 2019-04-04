package taller.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutenticationContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutenticationContext.class);

    private AutenticationService autenticationService;

    public AutenticationContext(AutenticationService autenticationService) {
        this.autenticationService = autenticationService;
    }

    public boolean autenticar(String login, String clave){
        LOGGER.info("=========================================");
        LOGGER.info("Se inicia el proceso de Autenticacion...");
        boolean result = this.autenticationService.autentica(login, clave);
        LOGGER.info("Resultado de Autenticacion: {}", result);

        return  result;
    }
}
