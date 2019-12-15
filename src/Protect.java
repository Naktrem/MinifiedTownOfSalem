import java.util.Scanner;

class Protect implements SpecialPower {
    private int playernumber;
    private String protectStatus;
    private Town town;

    public Protect(Town town) {
        this.town = town;
    }

    public String getProtectStatus() {
        return protectStatus;
    }


    @Override
    public void use() {
        if(!town.getCharacters().get(2).isAlive()){
            System.out.println("You are dead!");
            protectStatus = "Bodyguard is dead";
            return;
        }

        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 3) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        if (town.getCharacters().get(2).isBusy()) {
            protectStatus = "Bodyguard was busy.";
        } else {

            if (playernumber == 1 && town.getCharacters().get(2).isAlive() && !town.getCharacters().get(2).isBusy()) {
                town.getCharacters().get(0).setProtected(true);
                protectStatus = "Bodyguard protecting Jester";
                return;
            }
            if (playernumber == 2 && town.getCharacters().get(2).isAlive() && !town.getCharacters().get(2).isBusy()) {
                town.getCharacters().get(1).setProtected(true);
                protectStatus = "Bodyguard protecting Investigator";
                return;
            }
            if (playernumber == 4 && town.getCharacters().get(2).isAlive() && !town.getCharacters().get(2).isBusy()) {
                town.getCharacters().get(3).setProtected(true);
                protectStatus = "Bodyguard protecting Doctor";
                return;
            }
            if (playernumber == 5 && town.getCharacters().get(2).isAlive() && !town.getCharacters().get(2).isBusy()) {
                town.getCharacters().get(4).setProtected(true);
                protectStatus = "Bodyguard protecting SerialKiller";
                return;
            }
            if (playernumber == 6 && town.getCharacters().get(2).isAlive() && !town.getCharacters().get(2).isBusy()) {
                town.getCharacters().get(5).setProtected(true);
                protectStatus = "Bodyguard protecting Mafioso";
                return;
            }

        }
    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }

}
