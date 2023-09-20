public class reverseString{
    public static String mainly(String s){
        int end=s.length()-1;
        String ans="";
        while(0<=end){
            while(0<=end && s.charAt(end)==' ')
            end--;
            int start=end;
            if(0>end) break;
            while(0<=end && s.charAt(end) != ' ')
            end--;
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(end+1, start+1));
            }else{
                ans=ans.concat(" " + s.substring(end+1,start+1));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String st="the sky is blue";
        System.out.println(mainly(st));

    }
}
