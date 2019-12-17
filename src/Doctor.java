public class Doctor extends Character {
    private Heal heal;
    private Vote vote;

    public Doctor(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);

        heal = new Heal(town);
        setSpecialPower(heal);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(4);

    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return heal.getHealStatus();
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to heal: \n--> ");
        }else{
            System.out.print("Player 4 choose who to execute: \n--> ");
        }
    }

}