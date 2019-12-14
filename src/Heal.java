import java.util.Scanner;

class Heal implements SpecialPower {
    private int playernumber;
    private String healStatus;
    public Heal() {

    }

    public String getHealStatus(){
        return healStatus;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if(playernumber == 4){
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }if (Doctor.isBusy()){
            healStatus = "doctor is busy";
        }
        if (playernumber == 1 && !Jester.isAlive() && !Doctor.isBusy() && Doctor.isAlive()) {
            Jester.setAlive(true);
            healStatus = "Doctor healed Jester";
        }
        else if(playernumber==2 && !Investigator.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Investigator.setAlive(true);
            healStatus = "Doctor healed Investigator";
        }
        else if(playernumber==3 && !Bodyguard.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Bodyguard.setAlive(true);
            healStatus = "Doctor healed Bodyguard";
        }
        else if(playernumber==5 && !SerialKiller.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            SerialKiller.setAlive(true);
            healStatus = "Doctor healed SerialKiller";
        }
        else if(playernumber==6 && !Mafioso.isAlive() && !Doctor.isBusy() && Doctor.isAlive()){
            Mafioso.setAlive(true);
            healStatus = "Doctor healed Mafioso";
        }else{
            healStatus = "Doctor's chosen character is already healed.";
        }

    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }


}