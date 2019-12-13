class Investigator extends Character {
    public Investigator() {
        setSpecialPower(new Investigate());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(2);
        setBusy(false);
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