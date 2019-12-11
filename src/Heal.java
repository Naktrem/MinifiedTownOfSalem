import java.util.Scanner;

class Heal extends Characters implements SpecialPower {
    private int playernumber;

    public Heal() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
    }

    @Override
    public void specialPower() {
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

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }
}