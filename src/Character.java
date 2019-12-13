import java.util.LinkedList;
import java.util.List;

public abstract class Character implements Observable {
    private static boolean isAlive;
    private static boolean isProtected;
    private static boolean isBusy;
    private int playerNumber;
    public List<Observer> observers = new LinkedList<>();
    public SpecialPower specialPower;

    @Override
    public void notifyObservers() {
        for (Observer ob:observers) {
            ob.update(this);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void useSpecialPower(){
        specialPower.use();
        notifyObservers();
    }

    public abstract String getSpecialPowerDisplayStatus();

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public static boolean isAlive() {
        return isAlive;
    }

    public static void setAlive(boolean isAlive) {
        Character.isAlive = isAlive;
    }

    public static boolean isProtected() {
        return isProtected;
    }

    public static void setProtected(boolean isProtected) {
        Character.isProtected = isProtected;
    }

    public static boolean isBusy() { return isBusy; }

    public static void setBusy(boolean isBusy) { Character.isBusy = isBusy; }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public abstract void display();


}
































