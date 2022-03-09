package aldidi;

public class palindrome {
    private static boolean palindrome(String value){
        for (int i = 0; i < value.length() /2; i++){
            int indexAwal = i;
            int indexAkhir = value.length() -i -1;
            if (value.charAt(indexAwal) != value.charAt(indexAkhir)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("mobil"));
    }
}
