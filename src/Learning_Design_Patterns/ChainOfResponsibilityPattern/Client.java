package Learning_Design_Patterns.ChainOfResponsibilityPattern;

import Learning_Design_Patterns.ChainOfResponsibilityPattern.BaseHandlers.IPWhitelistingHandler;
import Learning_Design_Patterns.ChainOfResponsibilityPattern.BaseHandlers.TwoFactorAuthenticationHandler;
import Learning_Design_Patterns.ChainOfResponsibilityPattern.BaseHandlers.UsernamePasswordAuthenticationHandler;
import Learning_Design_Patterns.ChainOfResponsibilityPattern.Handler.AuthenticationHandler;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler upHandler = new UsernamePasswordAuthenticationHandler();
        AuthenticationHandler tfaHandler = new TwoFactorAuthenticationHandler();
        AuthenticationHandler ipHandler = new IPWhitelistingHandler();

        ipHandler.setNextHandler(upHandler);
        upHandler.setNextHandler(tfaHandler);

        boolean isAuthenticated = ipHandler.authenticate("user", "user123");
        if (isAuthenticated) {
            // Proceed with server access
            System.out.println("Access granted.");
        } else {
            // Handle authentication failure
            System.out.println("Access denied.");
        }
    }
}