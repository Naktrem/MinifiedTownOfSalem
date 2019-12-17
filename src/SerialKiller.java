class SerialKiller extends Character {
    Kill kill;
    private Vote vote;

    public SerialKiller(Town town) {
        vote =  new Vote(this, town);
        setVote(vote);
        kill = new Kill(town);
        setSpecialPower(kill);
        setAlive(true);
        setProtected(false);
        setPlayerNumber(5);
        setBusy(false);
    }

    @Override
    public String getSpecialPowerDisplayStatus() {
        return kill.getKillStatus();
    }

    @Override
    public String getVoteDisplayStatus() {
        return vote.getVoteStatus();
    }

    @Override
    public void display(boolean action) {
        if(action) {
            System.out.print("Choose who to kill: \n--> ");
        }else{
            System.out.print("Player 5 choose who to execute: \n--> ");
        }
    }
}