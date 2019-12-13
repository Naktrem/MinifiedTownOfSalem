class Bodyguard extends Character {
    Protect protect;
    public Bodyguard(Town town) {
        protect = new Protect(town);
        setSpecialPower(protect);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(3);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return protect.getProtectStatus();
    }

    @Override
    public void display() {
        System.out.print("Choose who to guard: \n--> ");
    }
}