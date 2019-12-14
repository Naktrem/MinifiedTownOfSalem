public class NightState implements State{
    private Town town;

    public NightState(Town town){
        this.town = town;
    }

    @Override
    public boolean actionState(){return true;}

    @Override
    public void timeState(){
        town.setCurrentState(this);
    }

}
