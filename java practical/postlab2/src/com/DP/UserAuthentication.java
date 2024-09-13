package com.DP;

public class UserAuthentication {
    private static UserAuthentication instance;

    // Private constructor prevents direct instantiation
    private UserAuthentication() {
    }

    // Singleton instance retrieval
    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    // Mock authentication (always returns true for simplicity)
    public boolean authenticateUser(String username, String password) {
        // In a real system, you would check username and password.
        return true; // Always return true for this demo
    }
}
