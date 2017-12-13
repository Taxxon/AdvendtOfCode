import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Emil Käck on 2017-12-06.
 */
public class day_6 {
    public static void main(String[] args) {

        ArrayList<String> line = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        String [] words;
        int[] input = new int[16];
        String add = "";
        int bigIndex = 0;
        int big = 0;
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String line1 = br.readLine();
            words = line1.split("\\s", -1);

            for (int i = 0; i < words.length; i++) {
                input[i] = Integer.parseInt(words[i]);
            }


            for (int i = 0; i < input.length; i++) {
                ints.add(input[i]);
            }
            while (true) {

                for (int i = 0; i < ints.size(); i++) {
                    if (ints.get(i) > big) {
                        bigIndex = i;
                        big = ints.get(i);
                    }
                }
                ints.set(bigIndex, 0);
                int k = 0;
                int j = bigIndex + 1;

                while (k != (big)) {
                    if (j == ints.size()) {
                        j = 0;
                    }
                    ints.set(j, (ints.get(j) + 1));
                    k++;
                    j++;
                }

            for (int i = 0; i < ints.size(); i++) {
                    if (i != (ints.size() - 1)) {
                        add += ints.get(i) + " ";
                    } else {
                        add += ints.get(i);
                    }
                }
                sum++;

            if (line.contains(add)){
                System.out.println(sum - line.indexOf(add) - 1);
                break;
            }
                big = 0;
                line.add(add);
                add = "";
            }
        } catch (IOException e) {
            System.out.println("NO");
        }
    }
}

