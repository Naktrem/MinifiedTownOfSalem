import java.util.Scanner;

class Murder implements SpecialPower {
    private int playernumber;
    private String output;
    private Town town;

    public Murder(Town town) {
        this.town = town;
    }
    public String getMurderStatus(){
        return output;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 6) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        if ((playernumber == 1 && town.getCharacters().get(0).isProtected()) || (playernumber == 2 && town.getCharacters().get(1).isProtected()) || (playernumber == 3 && !town.getCharacters().get(2).isProtected()) || (playernumber == 4 && !town.getCharacters().get(3).isProtected())) {
            output = "Mafioso couldnt kill the target because he/she is protected.";
        } else {
            if (town.getCharacters().get(5).isBusy()) {
                output = "Mafia was busy";
            } else {

                if (playernumber == 1 && !town.getCharacters().get(0).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                    town.getCharacters().get(0).setAlive(false);
                    output = "Mafia kill Jester.";
                }
                if (playernumber == 2 && !town.getCharacters().get(1).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                    town.getCharacters().get(1).setAlive(false);
                    output = "Mafia kill Investigator.";
                }
                if (playernumber == 3 && !town.getCharacters().get(2).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                    town.getCharacters().get(2).setAlive(false);
                    output = "Mafia kill Bodyguard.";
                }
                if (playernumber == 4 && !town.getCharacters().get(3).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                    town.getCharacters().get(3).setAlive(false);
                    output = "Mafia kill Doctor.";
                }
                else if (playernumber == 5 && !town.getCharacters().get(5).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                    output = "Mafia can't kill mafia.";
                }
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }
}