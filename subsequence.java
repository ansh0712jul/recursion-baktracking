public class subsequence {
    public static void main(String[] args) {
        String ques="abc";
        print_Sub(ques,"");
        
    }
    public static void print_Sub(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        print_Sub(ques.substring(1), ans);
        print_Sub(ques.substring(1), ans+ch);

    }
}
