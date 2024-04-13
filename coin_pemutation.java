public class coin_pemutation {
    public static void main(String[] args) {
        int coin[]={2,3,5};
        int sum=8;
        print_coin(coin, sum, "");
        
    }
    public static void print_coin(int coin[],int sum,String ans){
        if(sum==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(sum>=coin[i]){
                print_coin(coin, sum-coin[i], ans+coin[i]);
            }
        }
    }
}