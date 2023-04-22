import java.util.ArrayList;
import java.util.List;

//Використовуючи регулярні вирази знайти в рядку всі слова,
// що починаються з великої букви та закінчуються точкой  і
//замінити в цих реченях всі голосні на "_"
public class Task_3 {

    public static void main(String[] args) {
        String text = "Every year we go to Florida. We like to go to the beach. My favorite beach is called Emerson Beach. " +
                      "It is very long, with soft sand and palm trees. It is very beautiful. " +
                      "I like to make sandcastles and watch the sailboats go by. Sometimes there are dolphins and whales in the water!";
        String[] words = text.split(" ");

        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        for (String word : words) {
            if ((word.charAt(0) > 'A') && (word.charAt(0) < 'Z') | (word.charAt(0) > 'А') && (word.charAt(0) < 'Я')) {
                list2.add(word);
            }
        }
        System.out.println("Word with big letters " + list2);
        for (String word : list2) {
            word = word.replace('a', '_').replace('o', '_').replace('e', '_').
                    replace('i', '_').replace('u', '_').replace('y', '_');
            list3.add(word);
        }

        System.out.println("replacement vowels: " + list3);
    }
}