package String;

public class Reverse_prefix_of_word {
    public String reversePrefix(String word, char ch) {
        int idx = -1;
        int n = word.length();
        for(int i=0; i<n; i++){
            char c = word.charAt(i);
            if(c == ch){
                idx = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();

        if(idx != -1){
            int i = idx;

            while(i >= 0){
                sb.append(word.charAt(i));
                i--;
            }
            idx++;
            while(idx < n){
                sb.append(word.charAt(idx));
                idx++;
            }
            return sb.toString();
        }
        return word;
    }
}
