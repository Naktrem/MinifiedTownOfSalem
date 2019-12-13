import java.util.Scanner;

class Jest implements SpecialPower {
    private int playernumber;

    public Jest() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();

        if (playernumber == 2 && Jester.isAlive()) {
            Investigator.setBusy(true);

        }
        if (playernumber == 3 && Jester.isAlive()) {
            Bodyguard.setBusy(true);
        }
        if (playernumber == 4 && Jester.isAlive()) {
            Doctor.setBusy(true);
        }
        if (playernumber == 5 && Jester.isAlive()) {
            SerialKiller.setBusy(true);
        }
        if (playernumber == 6 && Jester.isAlive()) {
            Mafioso.setBusy(true);
        }

    }

    @Override
    public void printSpecialPowerStatus() {

    }
}