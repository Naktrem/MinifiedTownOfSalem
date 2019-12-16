import java.util.Scanner;

class Investigate implements SpecialPower {
    private int playernumber;
    private String output;
    private Town town;
    public Investigate(Town town) {
        this.town = town;
    }

    public String getInvestigationStatus(){
        return output;
    }

    @Override
    public void use() {
        if(!town.getCharacters().get(1).isAlive()){
            System.out.println("You are dead!");
            output = "Investigator is dead";
            return;
        }

        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();

        if (playernumber == 2) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }else {
            if (town.getCharacters().get(1).isBusy()) {
                output = "Investigator is busy with the jester!";
            } else {
                if (playernumber == 1 && town.getCharacters().get(1).isAlive() && !town.getCharacters().get(1).isBusy()) {
                    output = "Investigator investigated Jester";
                }  if (playernumber == 3 && town.getCharacters().get(1).isAlive() && !town.getCharacters().get(1).isBusy()) {
                    output = "Investigator investigated Bodyguard";
                }  if (playernumber == 4 && town.getCharacters().get(1).isAlive() && !town.getCharacters().get(1).isBusy()) {
                    output = "Investigator investigated Doctor";
                }  if (playernumber == 5 && town.getCharacters().get(1).isAlive() && !town.getCharacters().get(1).isBusy()) {
                    output = "Investigator investigated Serial Killer";
                }  if (playernumber == 6 && town.getCharacters().get(1).isAlive() && !town.getCharacters().get(1).isBusy()) {
                    output = "Investigator investigated Mafioso";
                }
            }
        }
        System.out.println("#\n#\n#\n#\n#\n#\n#\n#\n#\n");
    }
    @Override
    public void printSpecialPowerStatus() {
      //  System.out.println(output);
        System.out.println("Your task is done\n");
    }

}