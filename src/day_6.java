import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by emka15 on 2017-12-06.
 */
public class day_6 {
    public static void main(String[] args) {

        ArrayList<String> line = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        String [] words;
        String look = "";
        int[] input = new int[16];
        String add = "";
        int bigIndex = 0;
        int big = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String line1 = br.readLine();
            words = line1.split("\\s", -1);

            for (int i = 0; i < words.length; i++){
                input[i] = Integer.parseInt(words[i]);
            }


            for(int i = 0; i < input.length; i++){
                ints.add(input[i]);
            }

            for (int i = 0; i < ints.size(); i++) {
                if (i != (ints.size()-1)) {
                    look += ints.get(i) + " ";
                } else {
                    look += ints.get(i);
                }
            }

            for (int i = 0; i < ints.size(); i++){
                if (ints.get(i) > big){
                    bigIndex = i;
                    big = ints.get(i);
                }
            }
            System.out.println(bigIndex);
            System.out.println(ints.get(bigIndex));
            ints.set(bigIndex, 0);
            int k = 0;
            int j = bigIndex+1;
            while (k != (big+1)){{
                    ints.set(j, 1 + ints.set(j, (1 + ints.get(j))));
                    k++;
                    if (j == ints.size()) {
                        j = 0;
                    }
                }
            }
            System.out.println(ints);


            for (int i = 0; i < ints.size(); i++) {
                if (i != (ints.size()-1)) {
                    add  += ints.get(i) + " ";
                } else {
                    add += ints.get(i);
                }
            }
            line.add(add);

            if (line.contains(look)){
                System.out.println("WORKS!");
            }

        } catch (IOException e) {
            System.out.println("NO");
        }
    }
}

