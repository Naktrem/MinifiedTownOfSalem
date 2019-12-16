import java.util.*;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Memento memento = new Memento();
        EventObserver eventObserver = new EventObserver();
        boolean isObserversRegistered = false;
        int  dayCounter = 0;
        Scanner scanner = new Scanner(System.in);
/*
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
*/

        while(!isGameEnded(town)) {
            System.out.println("###########  DAY " + dayCounter);
            System.out.println("Night begins");
            for (int i = 1; i < 7; i++) {
                Character character = town.getIterator().getNext();
                if(!isObserversRegistered) {
                    character.registerObserver(eventObserver);
                    isObserversRegistered = true;
                }
                character.display(town.getCurrentState().actionState());
                character.useSpecialPower();
                memento.setActions(character.getSpecialPowerDisplayStatus());
            }
            memento.save(town.getCharacters());

            for (int i = 1; i < 7; i++) {
                Character character = town.getIterator().getNext();
                character.setBusy(false);
                character.setProtected(false);
            }

            System.out.println("Night ended! These things happened: ");

            System.out.println(memento.getActions(dayCounter));

            town.setCurrentState(new DayState(town));
            System.out.println("Day started");

            for (int i = 1; i < 7; i++) {
                Character character = town.getIterator().getNext();
                character.display(town.getCurrentState().actionState());
                if(town.getCharacters().get(i-1).isAlive()) {
                character.castVote();
            }
                memento.setActions(character.getVoteDisplayStatus());
            }

            town.getCharacters().get(town.whoToExecute()).setAlive(false);

            memento.save(town.getCharacters());
            System.out.println(memento.getActions(dayCounter));

            System.out.println("Player " + town.getCharacters().get(town.whoToExecute()) .getPlayerNumber()+ " is executed!\n");
            town.resetBallotBox();
            town.setCurrentState(new NightState(town));

            dayCounter++;
        }

    }

    private static boolean isGameEnded(Town town){
        if(!town.getCharacters().get(4).isAlive() && !town.getCharacters().get(5).isAlive()){
            // Town won!
            System.out.println("Town won!");
            return true;
        }else if(!town.getCharacters().get(0).isAlive() && !town.getCharacters().get(1).isAlive() && !town.getCharacters().get(2).isAlive() && !town.getCharacters().get(3).isAlive()){
             //Mafia won!
            System.out.println("Mafia won!");
            return true;
        }
        return false;
    }

}
