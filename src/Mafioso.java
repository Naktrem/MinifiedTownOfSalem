class Mafioso extends Character {
    Murder murder;
    public Mafioso(Town town) {
        murder = new Murder(town);
        setSpecialPower(murder);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(6);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return murder.getMurderStatus();
    }


    @Override
    public void display() {
        System.out.print("Choose who to murder: \n--> ");
    }
}