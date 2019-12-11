public class Town{

    private State dayState;
    private State nightState;
    private State currentState;

    public Town(){
        dayState = new DayState(this);
        nightState = new NightState(this);
        currentState = nightState;



    }


    public State getDayState() {
        return dayState;
    }

    public void setDayState(State dayState) {
        this.dayState = dayState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNightState() {
        return nightState;
    }

    public void setNightState(State nightState) {
        this.nightState = nightState;
    }



}
