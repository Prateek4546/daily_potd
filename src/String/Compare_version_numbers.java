package String;
import java.util.*;
public class Compare_version_numbers {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        ArrayList<Integer> v2 = new ArrayList<Integer>();

        int n = version1.length(); int m = version2.length();
        int i = 0; int j = 0;
        int num = 0;
        while(i < n){
            char c = version1.charAt(i++);
            if(c == '.'){
                v1.add(num);
                num = 0;
            }
            else  num = (num * 10) + (int)(c - '0');
        }

        v1.add(num);
        num = 0;
        while(j < m){
            char c = version2.charAt(j++);
            if(c == '.'){
                v2.add(num);
                num = 0;
            }
            else num = (num * 10) + (int)(c - '0');
        }

        v2.add(num);
        //   System.out.println(v1);
        //   System.out.println(v2);

        int p1 = 0; int p2 = 0;
        int v1_len = v1.size();
        int v2_len = v2.size();
        while(p1 < v1_len && p2 < v2_len){
            int val1 = v1.get(p1++);
            int val2 = v2.get(p2++);
            if(val1 > val2)return 1;
            if(val1 < val2)return -1;
        }
        while(p1 < v1_len){
            int val = v1.get(p1++);
            if(val > 0)return 1;
        }
        while(p2 < v2_len){
            int val = v2.get(p2++);
            if(val > 0)return -1;
        }
        return 0;
    }
}
