public interface Observable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
