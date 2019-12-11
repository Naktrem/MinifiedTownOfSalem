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
            Investigator.setAlive(false);
        }
        if (playernumber == 3 && Jester.isAlive()) {
            Bodyguard.setAlive(false);
        }
        if (playernumber == 4 && Jester.isAlive()) {
            Doctor.setAlive(false);
        }
        if (playernumber == 5 && Jester.isAlive()) {
            SerialKiller.setAlive(false);
        }
        if (playernumber == 6 && Jester.isAlive()) {
            Mafioso.setAlive(false);
        }

    }

    @Override
    public void printSpecialPowerStatus() {

    }
}