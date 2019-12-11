public class NightState implements State{
    private Town town;

    public NightState(Town town){
        this.town = town;
    }

    @Override
    public boolean canHeal() {
        return true;
    }

    @Override
    public boolean canKill() {
        return true;
    }

    @Override
    public boolean canMurder() {
        return true;
    }

    @Override
    public boolean canInvestigate() {
        return true;
    }

    @Override
    public boolean canProtect() {
        return true;
    }

    @Override
    public boolean canExecute() {
        return false;
    }

    public void dayBegin(){

    }

    @Override
    public void dayEnd(){
        town.setCurrentState(town.getNightState());
    }

}
