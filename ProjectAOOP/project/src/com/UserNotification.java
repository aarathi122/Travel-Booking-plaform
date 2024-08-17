package com;

class UserNotification implements Observer {

    private final String userName;

    UserNotification(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(EventType eventType, String message) {
        System.out.println("Notification to " + userName + ": " + message);
    }
}
