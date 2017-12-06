import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Emil Käck on 2017-12-03.
 */
public class day_4{
    public static void main(String[] args) {

        int sum = 0;
        int line2 = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split("\\s");
                line2 ++;
                char[] anagrams1;
                char[] anagrams2;

                for (int i = 0; i < word.length-1; i++) {
                    anagrams1 = word[i].toCharArray();
                    Arrays.sort(anagrams1);
                    String sortedString = new String(anagrams1);
                    for (int j = (i+1); j < word.length; j++) {
                        anagrams2 = word[j].toCharArray();
                        Arrays.sort(anagrams2);
                        String sortedString1 = new String(anagrams2);
                        System.out.println(sortedString+ " " + sortedString1);
                        if ((sortedString.equals(sortedString1)) && (i != j)){
                            i = (word.length-1);
                        } else if ((word.length - 2) == i){
                            sum++;
                        }

                    }
                };
            }
        } catch (IOException e){
            System.out.println("NO!");
        };
        System.out.println(sum);
    }
}
