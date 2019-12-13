import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();

        EventObserver eventObserver = new EventObserver();
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i < 7; i++){
            System.out.println("Press enter to reveal player " + i +"...");
            String readLine = scanner.nextLine();
            if(readLine.isEmpty()){
                switch(i){
                    case 1:
                        System.out.println("Player "+i+"is Jester.");
                        break;
                    case 2:
                        System.out.println("Player "+i+"is Investigator");
                        break;
                    case 3:
                        System.out.println("Player "+i+"is Bodyguard.");
                        break;
                    case 4:
                        System.out.println("Player "+i+"is Doctor.");
                        break;
                    case 5:
                        System.out.println("Player "+i+"is Serial Killer.");
                        break;
                    case 6:
                        System.out.println("Player "+i+"is Mafioso");
                        break;
                }
                System.out.println("Press enter to hide your character display.");
                scanner.nextLine();
                System.out.println("#\n#\n#\n#\n#\n#\n#\n#\n#\n");
            }
        }

        System.out.println("First night...");

        eventObserver.update(town.getIterator().getNext());

        System.out.println(town.getIterator().getNext());



    }

}
