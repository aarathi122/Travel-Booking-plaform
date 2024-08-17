package com;

import java.util.Set;

interface Subject {

    void registerObserver(Observer observer, Set<EventType> eventTypes);

    void removeObserver(Observer observer);

    void notifyObservers(EventType eventType, String message);
}
