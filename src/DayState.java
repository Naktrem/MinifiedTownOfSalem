public class DayState implements State{
    private Town town;

    public DayState(Town town){
        this.town = town;
    }

    @Override
    public boolean canHeal() {
        return false;
    }

    @Override
    public boolean canKill() {
        return false;
    }

    @Override
    public boolean canMurder() {
        return false;
    }

    @Override
    public boolean canInvestigate() {
        return false;
    }

    @Override
    public boolean canProtect() {
        return false;
    }

    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    public void dayEnd(){
        town.setCurrentState(town.getNightState());
    }

    @Override
    public void dayBegin() {

    }
}
