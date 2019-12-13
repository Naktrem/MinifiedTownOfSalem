public class Doctor extends Character {
    Heal heal;
    public Doctor() {
        heal = new Heal();
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