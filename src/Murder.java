import java.util.Scanner;

class Murder implements SpecialPower {
    private int playernumber;
    private String output;
    public Murder() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if ((playernumber == 1 && Jester.isProtected()) || (playernumber == 2 && Investigator.isProtected()) || (playernumber == 3 && !Bodyguard.isProtected()) || (playernumber == 4 && !Doctor.isProtected())) {
            output = "Mafioso couldnt kill the target because he/she is protected.";
        } else {
            if (Mafioso.isBusy()) {
                output = "Mafia was busy";
            } else {

                if (playernumber == 1 && !Jester.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Jester.setAlive(false);
                    output = "Mafia kill Jester.";
                }
                if (playernumber == 2 && !Investigator.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Investigator.setAlive(false);
                    output = "Mafia kill Investigator.";
                }
                if (playernumber == 3 && !Bodyguard.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Bodyguard.setAlive(false);
                    output = "Mafia kill Bodyguard.";
                }
                if (playernumber == 4 && !Doctor.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Doctor.setAlive(false);
                    output = "Mafia kill Doctor.";
                }
        /*
        if (playernumber == 6 && !Mafioso.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
            Mafioso.setAlive(false);
        }*/
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println(output);
    }
}