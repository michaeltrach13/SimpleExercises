public class Anagrams {

    public static boolean anagram(String s, String d){
        String n = s.toLowerCase();
        String m = d.toLowerCase();
        char[] first = n.toCharArray();
        char[] second = m.toCharArray();
        int[] one = new int[26];
        int[] two = new int[26];

        for( char i : first){
            if((int)i == 32)
                one[25]++;
            else
                one[(int)i-97]++;
        }
        for( char i : second){
            if((int)i == 32)
                 two[25]++;
            else
                two[(int)i-97]++;
        }
        for(int i = 0; i < 25; i++){
            if(one[i]!= two[i])
                return false;
        }

        return true;
    }
    public static void main(String[] args){
   System.out.println(anagram("hello there", "hello theer"));
    }
}
