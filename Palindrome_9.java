public class Palindrome_9 {
    public static void main(String[] args) {
        int x = 121;
        Palindrome_9 pl = new Palindrome_9();
       boolean y = pl.isPalindrome(x);
        System.out.println(y);
    }

    public boolean isPalindrome(int x){
        int Temp = x;
        int Rev = 0;
        while(x>0){
            int rem= x%10;
            Rev = (Rev * 10) + rem;
            x = x/10;
        }
        if (Temp == Rev){
            return true;
        }else return false;
    }
}


