import java.util.ArrayList;
import java.util.List;

public class NumberVamp1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i4 = 1000; i4 < 10000; i4++) {

            String str = "" + i4;
            char[] res = str.toCharArray();

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res.length; j++) {
                    if (i == j) break;
                    String first = "" + res[i] + res[j];
                    int firstInt = Integer.parseInt(first);
                    String second = "" + res[j] + res[i];
                    int secondInt = Integer.parseInt(second);
                    list1.add(firstInt);
                    list2.add(secondInt);
                }
            }

            for (int numb1 : list1) {
                for (int numb2 : list2) {
                    int numb3 = numb1 * numb2;
                    if (numb3 == i4) {
                        String numbStr1=""+numb1+numb2;
                        char[] duplicate=numbStr1.toCharArray();
                        if(duplicate[0]==duplicate[2] | duplicate[0]==duplicate[3] | duplicate[1]==duplicate[2] | duplicate[1]==duplicate[3]){
                             break;
                        }
                        else {
                            System.out.println("This is number Vamp!: " + numb3);
                            System.out.println(numb3 + " = " + numb1 + " * " + numb2);
                            System.out.println("list1 : " + list1);
                            System.out.println("list2 : " + list2);
                            System.out.println();
                        }
                    }
                }
            }
            list1.clear();
            list2.clear();
        }
    }

}


