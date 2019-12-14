import java.util.LinkedList;
import java.util.List;

public abstract class Character implements Observable {
    private boolean isAlive;
    private boolean isProtected;
    private boolean isBusy;
    private int playerNumber;
    public List<Observer> observers = new LinkedList<>();
    public SpecialPower specialPower;
    public IVote vote;

    @Override
    public void notifyObservers(boolean state) {
        for (Observer ob:observers) {
            ob.update(this, state);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void  castVote(){
        vote.castVote();
        notifyObservers(false);
    }

    public void useSpecialPower(){
        specialPower.use();
        notifyObservers(true);
    }

    public abstract String getSpecialPowerDisplayStatus();

    public abstract String getVoteDisplayStatus();

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public IVote getVote(){
        return vote;
    }

    public void setVote(IVote vote){
        this.vote = vote;
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }

    public boolean isBusy() { return isBusy; }

    public void setBusy(boolean isBusy) { this.isBusy = isBusy; }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public abstract void display(boolean action);


}
































