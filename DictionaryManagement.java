import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();

    public Dictionary getDictionary() {
        return dictionary;
    }

    int n;


    public DictionaryManagement() {
    }

    public void insertFromCommandline(){

        String word_target;
        String word_explain;
        Word word = new Word();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
       // ArrayList<Word> ListWord = new ArrayList<Word>();
        System.out.print("Nhap vao so tu can dich: ");
        n = sc.nextInt();
        for (int i = 0; i < n ; i++ ){
            System.out.println("Nhap vao tu  tieng anh can dich: ");
            word_target = sc1.nextLine();
            word.setWord_target(word_target);
            System.out.println("Nhap vao nghia cua tu tieng anh: ");
            word_explain = sc2.nextLine();
            word.setWord_explain(word_explain);
            dictionary.addWord(i ,word);
        }



    }


}