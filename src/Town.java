import java.util.ArrayList;
import java.util.HashMap;

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
    private HashMap<Character, Integer> ballotBox;

    public Town(){
        iterator = new CharacterIterator();
        characters = new ArrayList<>();
        ballotBox = new HashMap<>();
        dayState = new DayState(this);
        nightState = new NightState(this);
        currentState = nightState;
        initializeCharacters();
        addCharactersToIterator();
        for(Character character : characters){
            ballotBox.put(character, 0);
        }
    }

    public int whoToExecute(){
        Character toBeExecuted = null;

        for (HashMap.Entry<Character, Integer> entry : ballotBox.entrySet()) {
            if (ballotBox.get(toBeExecuted) == null || entry.getValue().compareTo(ballotBox.get(toBeExecuted)) > 0) {
                toBeExecuted = entry.getKey();
            }
        }

        return characters.indexOf(toBeExecuted);
    }

    private void initializeCharacters(){
        jester = new Jester(this);
        investigator = new Investigator(this);
        bodyguard = new Bodyguard(this);
        doc = new Doctor(this);
        serialKiller = new SerialKiller(this);
        mafioso = new Mafioso(this);

        characters.add(jester);
        characters.add(investigator);
        characters.add(bodyguard);
        characters.add(doc);
        characters.add(serialKiller);
        characters.add(mafioso);
    }

    public HashMap getBallotBox(){
        return ballotBox;
    }

    public void addVote(Character character){
        ballotBox.put(character, ballotBox.get(character) + 1);
    }

    public void resetBallotBox(){
        for(Character character : characters){
            ballotBox.put(character, 0);
        }
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
