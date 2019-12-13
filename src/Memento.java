import java.util.ArrayList;
import java.util.HashMap;

public class Memento implements IMemento{
    private int roundCounter;
    private ArrayList<String> actions;
    private HashMap<Integer, ArrayList<Character>> characterStates;

    public Memento(){
        roundCounter = 0;
        actions = new ArrayList<>();
        characterStates = new HashMap<>();
    }

    private void setActions(String actions){
        this.actions.add(actions);
    }

    public void resetActions(){
        this.actions.clear();
    }

    public String getActions(int round){
        return this.actions.get(round);
    }

    public void save(ArrayList<Character> characterStates, String actionsStatus){
        this.characterStates.put(roundCounter, characterStates);
        setActions(actionsStatus);
        roundCounter++;
    }

    public ArrayList<Character> undo(int round){
        actions.subList(round, actions.size()).clear();
        return this.characterStates.get(round);
    }
}
