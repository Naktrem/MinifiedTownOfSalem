class SerialKiller extends Character {
    public SerialKiller() {
        setSpecialPower(new Kill());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(5);
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