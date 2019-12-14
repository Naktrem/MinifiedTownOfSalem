import java.util.Scanner;

public class Vote implements IVote {
    private int playerVoteNumber;
    private String votedAgainst;
    private Character character;
    private Town town;

    public Vote(Character character, Town town){
        this.town = town;
        this.character = character;
    }

    public String getVoteStatus(){
        return votedAgainst;
    }

    @Override
    public void castVote() {
        Scanner scanner = new Scanner(System.in);
        playerVoteNumber = scanner.nextInt();
        playerVoteNumber -= 1;

        if (playerVoteNumber == character.getPlayerNumber()) {
            System.out.print("Maniac! Don't suicide, Vote!  \n--> ");
            castVote();
        }
        if (!town.getCharacters().get(playerVoteNumber).isAlive()) {
            System.out.print("It's already dead! Vote again  \n--> ");
            castVote();
        } else {
            town.addVote(town.getCharacters().get(playerVoteNumber));
            votedAgainst = character.getPlayerNumber() + " voted against player:" + (playerVoteNumber + 1);
        }
    }

    @Override
    public void printVoteStatus() {
        System.out.println("You decided to execute player " + (playerVoteNumber +1));
    }
}
