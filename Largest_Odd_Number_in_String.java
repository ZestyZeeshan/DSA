public class Largest_Odd_Number_in_String {
    public static String large(String num){
        int e=num.length()-1;
        for(int i=e;i>=0;i--){
            if(num.charAt(i)%2 != 0){
                String s1=num.substring(0, i+1);
                return s1;
            }
        }
        return "";
    }
    public static void main(String[] args){
        String num="54";
        String ans=large(num);
        System.out.println(ans);
    }
    
}
