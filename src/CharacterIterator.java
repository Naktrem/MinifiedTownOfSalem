import java.util.ArrayList;

public class CharacterIterator implements Iterator {
    private int iteratorIndex;
    private ArrayList<Characters> charactersList;

    public CharacterIterator() {
        iteratorIndex = 0;
        charactersList = new ArrayList<>();
    }

    public void addCharacters(ArrayList<Characters> characters){
        charactersList = characters;
    }

    @Override
    public Characters getNext() {
        if(hasNext()){
            iteratorIndex++;
            return charactersList.get(iteratorIndex);
        }else{
            iteratorIndex = 0;
            return getNext();
        }
    }

    @Override
    public boolean hasNext(){
        return iteratorIndex < charactersList.size();
    }
}
