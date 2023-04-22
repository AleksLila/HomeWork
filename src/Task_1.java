import java.util.*;
import java.util.Scanner;

//Task1
//Перестановка слів у зворотньому порядку у реченні (без виділення додаткової пам,яті)

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input text for reverse: ");
        String text=scanner.nextLine();
        List<String> reverseText=new ArrayList<>();
        String reverseWord;

        String[] words = text.split(" ");

        for(int i=0; i<words.length; i++){
            reverseWord=words[words.length-1-i];
            reverseText.add(reverseWord);
        }
        System.out.println();
        System.out.println();
        System.out.println("Зворотній порядок: ");
        for (String let : reverseText) {
            System.out.print(let+" ");
        }
    }
}