import java.util.Scanner;

class Investigate implements SpecialPower {
    private int playernumber;
    private String output;
    public Investigate() {

    }

    public String getInvestigationStatus(){
        return output;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();

        if (playernumber == 2) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }else {
            if (Investigator.isBusy()) {
                output = "You are busy with the jester!";
            } else {
                if (playernumber == 1 && Investigator.isAlive() && !Investigator.isBusy()) {
                    output = "Investigator invest Jester";
                }  if (playernumber == 3 && Investigator.isAlive() && !Investigator.isBusy()) {
                    output = "Investigator invest Bodyguard";
                }  if (playernumber == 4 && Investigator.isAlive() && !Investigator.isBusy()) {
                    output = "Investigator invest Doctor";
                }  if (playernumber == 5 && Investigator.isAlive() && !Investigator.isBusy()) {
                    output = "Investigator invest Serial Killer";
                }  if (playernumber == 6 && Investigator.isAlive() && !Investigator.isBusy()) {
                    output = "Investigator invest Mafioso";
                }
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println(output);
    }

}