import java.util.ArrayList;

public class CharacterIterator implements Iterator {
    private int iteratorIndex;
    private ArrayList<Character> charactersList;

    public CharacterIterator() {
        iteratorIndex = -1;
        charactersList = new ArrayList<>();
    }

    public void addCharacters(ArrayList<Character> characters){
        charactersList = characters;
    }

    @Override
    public Character getNext() {
        if(hasNext()){
            iteratorIndex++;
            return charactersList.get(iteratorIndex);
        }else{
            iteratorIndex = -1;
            return getNext();
        }
    }

    @Override
    public boolean hasNext(){
        return iteratorIndex < charactersList.size() - 1;
    }
}
