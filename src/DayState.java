public class DayState implements State{
    private Town town;

    public DayState(Town town){
        this.town = town;
    }

    @Override
    public boolean actionState(){return false;}

    @Override
    public void timeState(){
        town.setCurrentState(this);
    }

}
