import java.util.ArrayList;
import java.util.List;

public class DictionaryCommandline {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();

    public DictionaryManagement getDictionaryManagement() {
        return dictionaryManagement;
    }

    public DictionaryCommandline() {
    }

//    public String getInfor(){
//        return getDictionaryManagement().getDictionary().word.getWord_target() + getDictionaryManagement().getDictionary().word.getWord_explain();
//    }

    public void showAllWords() {
        System.out.println("English            " + "Tieng Viet           ");
        for (int i = 0; i < dictionaryManagement.getDictionary().getListWord().size(); i++) {
            System.out.println(dictionaryManagement.dictionary.getListWord().get(i).getWord_target() + "               "
                    + dictionaryManagement.dictionary.getListWord().get(i).getWord_explain());


        }

    }


}

