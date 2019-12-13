import java.util.Scanner;

class Murder implements SpecialPower {
    private int playernumber;
    private String output;
    public Murder() {

    }

    public String getMurderStatus(){
        return output;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 6) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
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
                else if (playernumber == 5 && !Mafioso.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    output = "Mafia can't kill mafia.";
                }
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }
}