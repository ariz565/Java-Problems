import java.util.*;
   public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        String lowerCase = "";
        String upperCase = "";

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                lowerCase += chars[i];
            } else if (Character.isUpperCase(chars[i])) {
                upperCase += chars[i];
            }
        }

        String output = lowerCase + upperCase;
        System.out.println("Output: " + output);
    }
}
