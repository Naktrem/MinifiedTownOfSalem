import com.sun.javaws.IconUtil;

import java.util.Scanner;

class Kill implements SpecialPower {
    private int playernumber;
    private String killStatus;
    private Town town;

    public Kill(Town town) {
        this.town = town;
    }

    public String getKillStatus() {
        return killStatus;
    }


    @Override
    public void use() {

        if (!town.getCharacters().get(4).isAlive()) {
            System.out.println("You are dead!");
            killStatus = "Serial Killer is dead";
            return;
        }

        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 5) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        } else {
            if (town.getCharacters().get(4).isBusy()) {
                killStatus = "Mafia was busy";
            }
            if (playernumber == 1 && !town.getCharacters().get(0).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                town.getCharacters().get(0).setAlive(false);
                killStatus = "Mafia kill Jester.";
                return;
            }
            if (playernumber == 2 && !town.getCharacters().get(1).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                town.getCharacters().get(1).setAlive(false);
                killStatus = "Mafia kill Investigator.";
                return;
            }
            if (playernumber == 3 && !town.getCharacters().get(2).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                town.getCharacters().get(2).setAlive(false);
                killStatus = "Mafia kill Bodyguard.";
                return;
            }
            if (playernumber == 4 && !town.getCharacters().get(3).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                town.getCharacters().get(3).setAlive(false);
                killStatus = "Mafia kill Doctor.";
                return;
            }
            if (playernumber == 6 && !town.getCharacters().get(5).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                killStatus = "Mafia can't kill mafia.";
                return;
            }

            killStatus = "Mafia coulnd't kill because target was protected";

        }
    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }

}