import java.util.Scanner;

class Jest implements SpecialPower {
    private int playernumber;
    private String jestStatus;

    public Jest() {

    }

    public String getJestStatus(){
        return jestStatus;
    }

    @Override
    public void use() {
        Scanner scanner = new Scanner(System.in);
        playernumber = scanner.nextInt();
        if (playernumber == 1) {
            System.out.print("You cannot choose yourself! Choose again \n--> ");
            use();
        }else {
            System.out.println("PLAYERNUMBER" + playernumber);
            if (playernumber == 2 && Jester.isAlive()) {
                Investigator.setBusy(true);
                System.out.println("2");

                jestStatus = "Jester jest Investigator";
            }  if (playernumber == 3 && Jester.isAlive()) {
                Bodyguard.setBusy(true);

                System.out.println("3");

                jestStatus = "Jester jest Bodyguard";
            }  if (playernumber == 4 && Jester.isAlive()) {
                Doctor.setBusy(true);
                System.out.println("4");

                jestStatus = "Jester jest Doctor";
            }  if (playernumber == 5 && Jester.isAlive()) {
                SerialKiller.setBusy(true);
                System.out.println("5");

                jestStatus = "Jester jest SerialKiller";
            }  if (playernumber == 6 && Jester.isAlive()) {
                Mafioso.setBusy(true);
                System.out.println("6");

                jestStatus = "Jester jest Mafioso";

            }
        }
    }

    @Override
    public void printSpecialPowerStatus() {
        System.out.println("You decided to go to player " + playernumber);
    }
}