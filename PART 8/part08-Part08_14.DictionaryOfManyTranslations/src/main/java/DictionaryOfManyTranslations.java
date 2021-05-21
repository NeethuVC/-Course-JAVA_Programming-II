
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionaryTranslations;

    public DictionaryOfManyTranslations() {
        this.dictionaryTranslations = new HashMap<>();
    }

    public void add(String word, String translation) {

        this.dictionaryTranslations.putIfAbsent(word, new ArrayList<>());

        if (dictionaryTranslations.containsKey(word)) {
            ArrayList<String> completed = this.dictionaryTranslations.get(word);
            completed.add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> newa = new ArrayList<>();
        if (dictionaryTranslations.containsKey(word)) {
            newa = this.dictionaryTranslations.get(word);
            return newa;
        } else {
            return newa;
        }

    }

    public void remove(String word) {

        if (dictionaryTranslations.containsKey(word)) {
            ArrayList<String> completed = this.dictionaryTranslations.get(word);
            completed.clear();
        }
    }
}
