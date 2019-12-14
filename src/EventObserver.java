public class EventObserver implements Observer {

    @Override
    public void update(Character character, boolean state) {
        if(state) {
            character.getSpecialPower().printSpecialPowerStatus();
        }else{
            character.getVote().printVoteStatus();
        }
    }
}
