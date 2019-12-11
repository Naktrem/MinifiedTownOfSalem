public class Doctor extends Characters{
    public Doctor() {
        setSpecialPower(new Heal());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(4);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }
}