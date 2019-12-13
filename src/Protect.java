import java.util.Scanner;

class Protect implements SpecialPower {
    private int playernumber;
    private String protectStatus;
    public Protect() {

    }

    public String getProtectStatus(){
        return protectStatus;
    }


    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 3) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }
        if (Bodyguard.isBusy()){
            protectStatus = "Bodyguard was busy.";
        }else {

            if (playernumber == 1 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
                Jester.setProtected(true);
                protectStatus = "Bodyguard protecting Jester";
            }
            if (playernumber == 2 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
                Investigator.setProtected(true);
                protectStatus = "Bodyguard protecting Investigator";
            }
            if (playernumber == 4 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
                Doctor.setProtected(true);
                protectStatus = "Bodyguard protecting Doctor";
            }
            if (playernumber == 5 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
                SerialKiller.setProtected(true);
                protectStatus = "Bodyguard protecting SerialKiller";
            }
            if (playernumber == 6 && Bodyguard.isAlive() && !Bodyguard.isBusy()) {
                Mafioso.setProtected(true);
                protectStatus = "Bodyguard protecting Mafioso";
            }
        }
    }
    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }

}
