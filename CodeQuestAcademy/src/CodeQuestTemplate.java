import java.util.Scanner;

public class CodeQuestTemplate {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<testCases; i++){
            int vals = Integer.parseInt(scanner.nextLine());
            System.out.println(vals);
        }
        System.out.println(testCases);
    }
}
