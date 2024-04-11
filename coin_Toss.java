public class coin_Toss {
    public static void main(String[] args) {
        int n =3;
        print_coin(n,"");
    }
    public static void print_coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        print_coin(n-1, ans+'H');
        print_coin(n-1, ans+'T');
    }
}
