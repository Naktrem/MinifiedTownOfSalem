import java.util.Scanner;

class Heal implements SpecialPower {
    private int playernumber;

    public Heal() {

    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 1 && !Jester.isAlive() && !Doctor.isBusy() && Doctor.isAlive()) {
            Jester.setAlive(true);
        }/*
        if(playernumber==2 && !Investigator.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Jester.setAlive(true);
        }
        if(playernumber==3 && !Bodyguard.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Jester.setAlive(true);
        }
        if(playernumber==5 && !SerialKiller.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Jester.setAlive(true);
        }
        if(playernumber==6 && !Mafioso.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Jester.setAlive(true);
        }*/
    }

    public void printSpecialPowerStatus(){
        System.out.printf("DOC HEAL JES");
    }

}