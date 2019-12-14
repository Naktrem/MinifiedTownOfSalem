class Investigator extends Character {
    Investigate investigation;
    private Vote vote;

    public Investigator(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);
        investigation = new Investigate(town);
        setSpecialPower(investigation);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(2);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return investigation.getInvestigationStatus();
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to investigate: \n--> ");
        }else{
            System.out.print("Choose who to execute: \n--> ");
        }
    }
}