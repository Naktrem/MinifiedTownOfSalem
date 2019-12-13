import java.util.ArrayList;

public interface IMemento {
    void resetActions();
    String getActions(int round);
    void save(ArrayList<Character> characterStates);
    ArrayList<Character> undo(int round);
}
