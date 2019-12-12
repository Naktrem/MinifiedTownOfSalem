import java.util.Scanner;

class Heal implements SpecialPower {
    private int playernumber;
    private String healStatus;
    public Heal() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 1 && !Jester.isAlive() && !Doctor.isBusy() && Doctor.isAlive()) {
            Jester.setAlive(true);
            healStatus = "Doctor healed Jester";
        }
        if(playernumber==2 && !Investigator.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Investigator.setAlive(true);
        }
        if(playernumber==3 && !Bodyguard.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Bodyguard.setAlive(true);
        }
        if(playernumber==5 && !SerialKiller.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            SerialKiller.setAlive(true);
        }
        if(playernumber==6 && !Mafioso.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Mafioso.setAlive(true);
        }
    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println(healStatus);
    }


}