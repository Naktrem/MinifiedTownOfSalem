import com.sun.javaws.IconUtil;

import java.util.Scanner;

class Kill implements SpecialPower {
    private int playernumber;
    private String killStatus;
    public Kill() {

    }
    public String getKillStatus(){
        return killStatus;
    }


    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 5) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        if ((playernumber == 1 && Jester.isProtected()) || (playernumber == 2 && Investigator.isProtected()) || (playernumber == 3 && !Bodyguard.isProtected()) || (playernumber == 4 && !Doctor.isProtected())) {
            killStatus = "Serial killer couldnt kill the target because he/she was protected.";
        } else {
            if (SerialKiller.isBusy()) {
                killStatus = "Mafia was busy";
            } else {
                if (playernumber == 1 && !Jester.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Jester.setAlive(false);
                    killStatus = "Mafia kill Jester.";
                }
                if (playernumber == 2 && !Investigator.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Investigator.setAlive(false);
                    killStatus = "Mafia kill Investigator.";
                }
                if (playernumber == 3 && !Bodyguard.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Bodyguard.setAlive(false);
                    killStatus = "Mafia kill Bodyguard.";
                }
                if (playernumber == 4 && !Doctor.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    Doctor.setAlive(false);
                    killStatus = "Mafia kill Doctor.";
                }
                if (playernumber == 6 && !Mafioso.isProtected() && SerialKiller.isAlive() && !SerialKiller.isBusy()) {
                    killStatus = "Mafia can't kill mafia.";
                }
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }

}