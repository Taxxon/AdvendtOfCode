import java.util.Scanner;

/**
 * Created by Emil käck on 2017-12-02.
 */
public class day_2 {
    public static void main(String[] args) {
        String row1;
        int first = 0;
        int max = 0;
        int smal = 100000;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i <= 15; i++) {
            max = 0;
            smal = 10000;
            String[] fields;
            try {
                row1 = myScanner.nextLine();
                fields = row1.split("\t", -1);
            } catch (ArrayIndexOutOfBoundsException e){
                continue;
            }
            for (int j = 0; j <= fields.length; j++) {
                try {
                    try {
                        first = Integer.parseInt(fields[j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
                if (max < first) {
                    max = first;
                } if (smal > first) {
                    smal = first;
                }
            }
            System.out.println(smal);
            System.out.println(max);
            sum += (max - smal);
        }
        System.out.println(sum);
    }
}
