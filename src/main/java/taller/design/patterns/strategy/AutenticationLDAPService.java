package taller.design.patterns.strategy;

public abstract class AutenticationLDAPService implements AutenticationService {

    protected String GROUP_NAME = "bbbva.taller.pe";

    @Override
    public boolean autentica(String login, String clave) {
        return validate(login, clave);
    }

    protected abstract boolean validate(String login, String clave);
}
