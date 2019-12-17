class Bodyguard extends Character {
    Protect protect;
    private Vote vote;

    public Bodyguard(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);
        protect = new Protect(town);
        setSpecialPower(protect);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(3);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return protect.getProtectStatus();
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to guard: \n--> ");
        }else{
            System.out.print("Player 3 choose who to execute: \n--> ");
        }
    }
}