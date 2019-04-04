package taller.design.patterns.strategy;

public abstract class AutenticationBDService implements AutenticationService {

    protected String TYPE = "NoSql";
    protected int timeOut = 2000;

    @Override
    public boolean autentica(String login, String clave) {
        Object connection = getConnection();
        return validate(connection, login, clave);
    }

    protected abstract boolean validate(Object connection, String login, String clave);

    protected abstract Object getConnection();
}
