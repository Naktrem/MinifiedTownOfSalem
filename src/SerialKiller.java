class SerialKiller extends Character {
    Kill kill;
    public SerialKiller(Town town) {
        kill = new Kill(town);
        setSpecialPower(kill);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(5);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return kill.getKillStatus();
    }


    @Override
    public void display() {
        System.out.print("Choose who to kill: \n--> ");
    }
}