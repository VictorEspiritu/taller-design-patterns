package taller.design.patterns.strategy;

public abstract class AutenticationOAUTHService implements AutenticationService {

    protected String autenticationType = "11235813";
    protected String resourceServer = "www.google.com";

    @Override
    public boolean autentica(String login, String clave) {
        return validate(encryptData(login, clave));
    }

    protected abstract boolean validate(int encryptData);

    protected abstract int encryptData(String login, String clave);


}
