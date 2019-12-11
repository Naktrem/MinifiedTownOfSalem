import java.util.Scanner;

class Protect implements SpecialPower {
    private int playernumber;
    public Protect() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 1 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
            Jester.setProtected(true);
        }
        if (playernumber == 2 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
            Investigator.setProtected(true);
        }
        if (playernumber == 4 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
            Doctor.setProtected(true);
        }
        if (playernumber == 5 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
            SerialKiller.setProtected(true);
        }
        if (playernumber == 6 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
            Mafioso.setProtected(true);
        }

    }
    @Override
    public void printSpecialPowerStatus() {

    }

}
