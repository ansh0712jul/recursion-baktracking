import java.util.ArrayList;

public class generate_parenthesis {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        int n=3;
        paranthesis(n, 0, 0, "",l);
        System.out.println(l);
        
    }
    public static void paranthesis(int n,int op,int cl,String ans,ArrayList<String> l){
        if(op==n && cl==n){
            // System.out.println(ans);
            l.add(ans);
            return;
            
        }
        if(op<n) paranthesis(n,op+1,cl, ans+'(',l);
        
       if(cl<op) paranthesis(n,op,cl+1, ans+')',l);

    }
}
