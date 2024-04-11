public class printdec {

    // THIS IS TAIL RECURSION KYUKI KAAM JAATE TIME HI HO RHA H ISLYE 
    // HEAD RECURSION--> ESI RECURSION JISME WAPIS AATE TIME CALCULATION HO RHI HO
    public static void main(String[] args) {
        int n=5;
        printdec1(n);
    }
    public static void printdec1(int  n){
        if(n==0) return;
        System.out.println(n);
        printdec1(n-1);
    }
}
