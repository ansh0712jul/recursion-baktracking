public class coinToss2 {
    public static void main(String[] args) {
        int n =3;
        print_coin(n,"");
    }
    public static void print_coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
        print_coin(n-1, ans+'H');
        print_coin(n-1, ans+'T');
    }
}
