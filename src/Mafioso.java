class Mafioso extends Character {
    Murder murder;
    private Vote vote;

    public Mafioso(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);
        murder = new Murder(town);
        setSpecialPower(murder);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(6);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return murder.getMurderStatus();
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to murder: \n--> ");
        }else{
            System.out.print("Choose who to execute: \n--> ");
        }
    }
}