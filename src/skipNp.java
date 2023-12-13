import java.util.Scanner;

//WAP series of no, from 1--20, print 1 and skip one number and print 3,
//skip 4,5 and print 6
// skip 7,8,9 and print 10
public class skipNp {
    public static void main(String args[]) {
        int skip = 1;
        int n;
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i = i + skip) {
            System.out.println(i);
            skip = skip + 1;
        }

    }
}
