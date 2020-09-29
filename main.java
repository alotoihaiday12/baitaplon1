import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        //Dictionary dictionary = new Dictionary();
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        //DictionaryManagement = new
        dictionaryCommandline.getDictionaryManagement().insertFromCommandline();
        dictionaryCommandline.showAllWords();



    }
}
