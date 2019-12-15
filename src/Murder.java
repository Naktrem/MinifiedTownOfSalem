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

        if(!town.getCharacters().get(5).isAlive()){
            System.out.println("You are dead!");
            output = "Mafioso is dead";
            return;
        }

        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 6) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        else {
            if (town.getCharacters().get(5).isBusy()) {
                output = "Mafia was busy";
                return;
            }
            if (playernumber == 1 && !town.getCharacters().get(0).isProtected() && town.getCharacters().get(5).isAlive() && !town.getCharacters().get(5).isBusy()) {
                town.getCharacters().get(0).setAlive(false);
                output = "Mafia kill Jester.";
                return;
            }
            if (playernumber == 2 && !town.getCharacters().get(1).isProtected() && town.getCharacters().get(5).isAlive() && !town.getCharacters().get(5).isBusy()) {
                town.getCharacters().get(1).setAlive(false);
                output = "Mafia kill Investigator.";
                return;
            }
            if (playernumber == 3 && !town.getCharacters().get(2).isProtected() && town.getCharacters().get(5).isAlive() && !town.getCharacters().get(5).isBusy()) {
                town.getCharacters().get(2).setAlive(false);
                output = "Mafia kill Bodyguard.";
                return;
            }
            if (playernumber == 4 && !town.getCharacters().get(3).isProtected() && town.getCharacters().get(5).isAlive() && !town.getCharacters().get(5).isBusy()) {
                town.getCharacters().get(3).setAlive(false);
                output = "Mafia kill Doctor.";
                return;
            }
            if (playernumber == 5 && !town.getCharacters().get(5).isProtected() && town.getCharacters().get(4).isAlive() && !town.getCharacters().get(4).isBusy()) {
                output = "Mafia can't kill mafia.";
                return;
            }
            output = "Mafia coulnd't kill because target was protected";
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }
}