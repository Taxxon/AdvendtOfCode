import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Emil Käck on 2017-12-03.
 */
public class day_4{
    public static void main(String[] args) {

        int sum = 512;

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split("\\s");
                for (int i = 0; i < word.length-1; i++) {
                    for (int j = (i+1); j < word.length; j++) {
                        if ((word[i].equals(word[j])) && (i != j)){
                            sum -= 1;
                            i = (word.length-1);

                        }
                    }
                }
            }
        } catch (IOException e){
            System.out.println("NO!");
        }
        System.out.println(sum);
    }
}
