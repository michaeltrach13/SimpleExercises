public class Scrabble {

    public static boolean canSpell(String letters, String word) {
        String n = letters.toLowerCase();
        String m = word.toLowerCase();
        char[] first = n.toCharArray();
        char[] second = m.toCharArray();
        int[] one = new int[25];
        int[] two = new int[25];

        for (char i : first) {
            one[(int) i - 97]++;
        }
        for (char i : second) {
            two[(int) i - 97]++;
        }
        for(int i =0; i < one.length;i++){
            if(two[i]>one[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
    System.out.println(canSpell("ohle","hello"));
    }
}
