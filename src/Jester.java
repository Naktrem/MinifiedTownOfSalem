public class Jester extends Character {
    Jest jest;
    public Jester(Town town) {
        jest = new Jest(town);
        setSpecialPower(jest);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(1);
    }

    @Override
    public void display() {
        System.out.print("Choose who to jest: \n--> ");
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return jest.getJestStatus();
    }


}