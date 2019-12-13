class Investigator extends Character {
    Investigate investigation;
    public Investigator(Town town) {
        investigation = new Investigate(town);
        setSpecialPower(investigation);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(2);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return investigation.getInvestigationStatus();
    }


    @Override
    public void display() {
        System.out.print("Choose who to investigate: \n--> ");
    }
}