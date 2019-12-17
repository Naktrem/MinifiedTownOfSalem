public class Jester extends Character {
    Jest jest;
    private Vote vote;

    public Jester(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);
        jest = new Jest(town);
        setSpecialPower(jest);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(1);
    }


    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to jest: \n--> ");
        }else{
            System.out.print("Player 1 choose who to execute: \n--> ");
        }
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return jest.getJestStatus();
    }


}