import java.util.Scanner;

class Heal implements SpecialPower {
    private int playernumber;
    private String healStatus;
    private Town town;

    public Heal(Town town) {
        this.town = town;
    }

    public String getHealStatus(){
        return healStatus;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 4) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        if (town.getCharacters().get(3).isBusy()) {
            healStatus = "Doctor is busy.";
        } else {
            if (playernumber == 1 && !town.getCharacters().get(0).isAlive() && !town.getCharacters().get(3).isBusy() && town.getCharacters().get(3).isAlive()) {
                town.getCharacters().get(0).setAlive(true);
                healStatus = "Doctor healed Jester";
            } else if (playernumber == 2 && !town.getCharacters().get(1).isAlive() && !town.getCharacters().get(3).isBusy() && town.getCharacters().get(3).isAlive()) {
                town.getCharacters().get(1).setAlive(true);
                healStatus = "Doctor healed Investigator";
            } else if (playernumber == 3 && !town.getCharacters().get(2).isAlive() && !town.getCharacters().get(3).isBusy() && town.getCharacters().get(3).isAlive()) {
                town.getCharacters().get(2).setAlive(true);
                healStatus = "Doctor healed Bodyguard";
            } else if (playernumber == 5 && !town.getCharacters().get(4).isAlive() && !town.getCharacters().get(3).isBusy() && town.getCharacters().get(3).isAlive()) {
                town.getCharacters().get(4).setAlive(true);
                healStatus = "Doctor healed SerialKiller";
            } else if (playernumber == 6 && !town.getCharacters().get(5).isAlive() && !town.getCharacters().get(3).isBusy() && town.getCharacters().get(3).isAlive()) {
                town.getCharacters().get(5).setAlive(true);
                healStatus = "Doctor healed Mafioso";
            } else {
                healStatus = "Doctor's chosen character is already healed.";
            }

        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }


}