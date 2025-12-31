public class Java12 {
    public static void main(String[] main){
        int n = 31; // note: fix for n = 0
        boolean ans = (n & (n-1))== 0;
        System.out.println(ans);
    }
}
