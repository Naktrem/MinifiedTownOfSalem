public class Jester extends Character {
    public Jester() {
        setSpecialPower(new Jest());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return null;
    }


    @Override
    public void useSpecialPower() {
        setSpecialPower(new Heal());
        notifyObservers();
    }
}