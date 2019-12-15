import java.util.Scanner;

class Jest implements SpecialPower {
    private int playernumber;
    private String jestStatus;
    private Town town;

    public Jest(Town town) {
        this.town = town;
    }

    public String getJestStatus() {
        return jestStatus;
    }

    @Override
    public void use() {
        if(!town.getCharacters().get(0).isAlive()){
            System.out.println("You are dead!");
            jestStatus = "Jester is dead";
            return;
        }
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 1) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        } else {
            if (playernumber == 2 &&  town.getCharacters().get(0).isAlive()) {
                town.getCharacters().get(1).setBusy(true);
                jestStatus = "Jester jest Investigator";
            }
            if (playernumber == 3 && town.getCharacters().get(0).isAlive()) {
                town.getCharacters().get(2).setBusy(true);
                jestStatus = "Jester jest Bodyguard";
            }
            if (playernumber == 4 && town.getCharacters().get(0).isAlive()) {
                town.getCharacters().get(3).setBusy(true);
                jestStatus = "Jester jest Doctor";
            }
            if (playernumber == 5 && town.getCharacters().get(0).isAlive()) {
                town.getCharacters().get(4).setBusy(true);
                jestStatus = "Jester jest SerialKiller";
            }
            if (playernumber == 6 && town.getCharacters().get(0).isAlive()) {
                town.getCharacters().get(5).setBusy(true);
                jestStatus = "Jester jest Mafioso";

            }
        }
    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }
}