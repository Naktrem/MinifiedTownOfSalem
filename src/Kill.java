import java.util.Scanner;

class Kill implements SpecialPower {
    private int playernumber;

    public Kill() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();

        if (playernumber == 1 && !Jester.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Jester.setAlive(false);
        }
        if (playernumber == 2 && !Investigator.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Investigator.setAlive(false);
        }
        if (playernumber == 3 && !Bodyguard.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Bodyguard.setAlive(false);
        }
        if (playernumber == 4 && !Doctor.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Doctor.setAlive(false);
        }
        /*
        if (playernumber == 6 && !Mafioso.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Mafioso.setAlive(false);
        }*/

    }
    @Override
    public void printSpecialPowerStatus() {

    }

}