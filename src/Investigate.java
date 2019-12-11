import java.util.Scanner;

class Investigate extends Characters implements SpecialPower {
    private int playernumber;
    private String output;
    public Investigate() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
    }

    @Override
    public void specialPower() {
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

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }
}