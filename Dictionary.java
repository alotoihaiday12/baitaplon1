import java.util.ArrayList;
import java.util.List;

public class Dictionary {
   // Word word = new Word();

//    public Word getWord() {
//        return word;
//    }

    private ArrayList<Word> ListWord = new ArrayList<Word>();

    public ArrayList<Word> getListWord() {
        return ListWord;
    }

    public void addWord(int i, Word word){
        ListWord.add(i, word);
    }

}
