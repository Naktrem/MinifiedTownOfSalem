class Bodyguard extends Character {
    public Bodyguard() {
        setSpecialPower(new Protect());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(3);
        setBusy(false);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return null;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }
}