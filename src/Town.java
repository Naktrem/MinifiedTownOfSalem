import java.util.ArrayList;

public class Town{
    private ArrayList<Character> characters;
    private State dayState;
    private State nightState;
    private State currentState;
    private Doctor doc;
    private Jester jester;
    private Investigator investigator;
    private Mafioso mafioso;
    private SerialKiller serialKiller;
    private Bodyguard bodyguard;
    private CharacterIterator iterator;

    public Town(){
        iterator = new CharacterIterator();
        characters = new ArrayList<>();
        initializeCharacters();
        addCharactersToIterator();

        dayState = new DayState(this);
        nightState = new NightState(this);
        currentState = nightState;
    }

    private void initializeCharacters(){
        doc = new Doctor();
        jester = new Jester();
        investigator = new Investigator();
        mafioso = new Mafioso();
        serialKiller = new SerialKiller();
        bodyguard = new Bodyguard();
        characters.add(doc);
        characters.add(jester);
        characters.add(investigator);
        characters.add(mafioso);
        characters.add(serialKiller);
        characters.add(bodyguard);
    }

    private void addCharactersToIterator(){
        iterator.addCharacters(characters);
    }

    public CharacterIterator getIterator(){
        return iterator;
    }

    public ArrayList<Character> getCharacters(){
        return characters;
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
