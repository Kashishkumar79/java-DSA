public class Palindrome {
    public static void checkPalindrome(String name1){
        int i = 0, j = name1.length() - 1;
        boolean isPalindrome = true;

        while(i < j){
            if(name1.charAt(i) != name1.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome){
            System.out.println(name1 + " is a palindrome");
        } else {
            System.out.println(name1 + " is not a palindrome");
        }
    }

    public static void main(String[] args){
        String name = "kanak";
        checkPalindrome(name);
    }
}