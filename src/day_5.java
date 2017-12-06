import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by emka15 on 2017-12-06.
 */
public class day_5 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int sum = 0;
        int lengh = 0;
        int j = 0;
        int word = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("input2.txt"))) {
            String line;
            while ((line = br.readLine()) != null){
                word = Integer.parseInt(line);
                arrayList.add(0, word);
                lengh += 1;
            }
            for (int i = lengh-1; (i <= lengh) && (i > -1) ;){
                try {
                    j = i;
                    sum += 1;
                    i -= arrayList.get(i);
                    if (arrayList.get(j) >= 3){
                        arrayList.set(j, arrayList.get(j) -1);
                    }else {
                        arrayList.set(j, arrayList.get(j) + 1);
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    continue;
                }
            }
        }catch (IOException e){
            System.out.println("NO");
        }
        System.out.println(sum);
    }
}
