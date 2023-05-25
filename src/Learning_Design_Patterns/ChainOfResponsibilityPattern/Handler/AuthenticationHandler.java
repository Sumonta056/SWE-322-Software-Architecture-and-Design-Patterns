package Learning_Design_Patterns.ChainOfResponsibilityPattern.Handler;

public interface AuthenticationHandler {
    void setNextHandler(AuthenticationHandler authenticationHandler);
    boolean authenticate(String userName, String password);
}
