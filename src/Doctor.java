public class Doctor extends Character {
    Heal heal;
    public Doctor(Town town) {
        heal = new Heal(town);
        setSpecialPower(heal);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(4);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return heal.getHealStatus();
    }

    @Override
    public void display() {
        System.out.print("Choose who to heal: \n--> ");
    }

}