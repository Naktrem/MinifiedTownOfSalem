import java.util.Scanner;

class Investigate implements SpecialPower {
    private int playernumber;
    private String output;
    public Investigate() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();

        if (Investigator.isBusy()){
            output = "Investigator was busy";
        }else {
            if (playernumber == 1 && Investigator.isAlive() && !Investigator.isBusy()) {
                output = "Investigator invest Jester";
            }
            if (playernumber == 3 && Investigator.isAlive() && !Investigator.isBusy()) {
                output = "Investigator invest Bodyguard";
            }
            if (playernumber == 4 && Investigator.isAlive() && !Investigator.isBusy()) {
                output = "Investigator invest Doctor";
            }
            if (playernumber == 5 && Investigator.isAlive() && !Investigator.isBusy()) {
                output = "Investigator invest Serial Killer";
            }
            if (playernumber == 6 && Investigator.isAlive() && !Investigator.isBusy()) {
                output = "Investigator invest Mafioso";
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println(output);
    }

}