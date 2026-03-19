public class stringCompression {

    public static String stringCompresss(String str1) {
        String newStr = "";
        for (int i = 0; i < str1.length(); i++) {
            int count = 1;

            while (i < str1.length() - 1 && str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str1.charAt(i);
            if (count > 1) {
                newStr += count;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("New String is " + stringCompresss(str));
    }
}
