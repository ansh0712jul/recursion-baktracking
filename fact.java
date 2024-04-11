public class fact {
    public static void main(String[] args) {
        int n =5;
        System.out.println(f(n,1));
    }
    public static int fact(int n){//USING HEAD RECURSION
        if(n==0) return 1;
        int fn=fact(n-1);
        return n*fn;
    }
    public static int f(int n,int ans ){//using tail recursion
        if(n==0) return ans;
        return f(n-1, ans*n);
    }
}
