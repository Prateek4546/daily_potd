package Bit_Manipulation;

import java.util.*;

public class Wonderful_substrings {
    public long wonderfulSubstrings(String s) {
        Map<Long , Long> map = new HashMap<>();

        long result = 0;
        int n = s.length();
        int curr_xor = 0;
        map.put(0L , 1L);
        for(int i=0; i<n; i++){
            int  idx = s.charAt(i) - 'a';

            curr_xor ^= (1 << idx);

            result  += map.getOrDefault((long) curr_xor , 0L);
            for(char c ='a'; c<='j'; c++){
                idx = c - 'a';
                long check_xor = (curr_xor ^ (1 << idx));
                result += map.getOrDefault((long) check_xor , 0L);
            }
            map.put((long) curr_xor , map.getOrDefault((long) curr_xor , 0L) + 1);
        }
        return result;
    }
}
