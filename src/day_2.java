import java.util.Scanner;

/**
 * Created by Emil käck on 2017-12-02.
 */
public class day_2 {
    public static void main(String[] args) {
        String row1;
        int first;
        int second;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i <= 15; i++) {
            String[] fields;
            try {
                row1 = myScanner.nextLine();
                fields = row1.split("\t", -1);
            } catch (ArrayIndexOutOfBoundsException e){
                continue;
            }
            for (int j = 0; j <= fields.length; j++) {
                for (int k = j +1; k <= fields.length; k++) {
                        try {
                            first = Integer.parseInt(fields[j]);
                            second = Integer.parseInt(fields[k]);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            continue;
                        }
                    if ((first % second) == 0) {
                        if (first > second) {
                            sum += (first / second);
                            System.out.println(first / second);
                        } else {
                            sum += (second / first);
                            System.out.println(second / first);
                        }
                    } else if((second % first) == 0){
                        if (first > second) {
                            sum += (first / second);
                            System.out.println(first / second);
                        } else {
                            sum += (second / first);
                            System.out.println(second / first);
                        }
                    }
                }
            }
            System.out.println(row1);
        }
        System.out.println(sum);
    }
}
