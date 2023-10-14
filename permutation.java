import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
       // permut("","abc");
       ArrayList<String> ans=permutlist(" ", "abc");
       System.out.println(ans);
    }
    static void permut(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<p.length();i++){
            String fir=p.substring(0, i);
            String end=p.substring(i,p.length());
            permut(fir+ch+end, up.substring(1));
        }

    }
    // returning all the permute in th earraylist
     static ArrayList<String> permutlist(String p, String up){
        if(up.isEmpty()){
          ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<p.length();i++){
            String fir=p.substring(0, i);
            String end=p.substring(i, p.length());
           ans.addAll( permutlist(fir+ch+end, up.substring(1)));
        }
        return ans;

    }
}
