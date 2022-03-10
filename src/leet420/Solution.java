package leet420;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    Queue<Integer> que;
    public int strongPasswordChecker(String s) {
        int len = s.length();
        if (len == 0) return 6;
        int need1 = 1;
        int need2 = 1;
        int need3 = 1;
        que = new PriorityQueue<>(Comparator.comparingInt(a -> a % 3));
        int cnt = 1;
        if (Character.isLowerCase(s.charAt(0))) need1 = 0;
        if (Character.isUpperCase(s.charAt(0))) need2 = 0;
        if (Character.isDigit(s.charAt(0))) need3 = 0;
        for (int i = 1; i < len; ++i) {
            if (Character.isLowerCase(s.charAt(i))) need1 = 0;
            if (Character.isUpperCase(s.charAt(i))) need2 = 0;
            if (Character.isDigit(s.charAt(i))) need3 = 0;
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (cnt >= 3)
                    que.add(cnt);
                cnt = 1;
            } else {
                ++cnt;
            }
        }
        if (cnt >= 3)
            que.add(cnt);
        int need = need1 + need2 + need3;
        int ans = 0;
        if (len < 6) {
            if (len == 5) {
                if (need >= 2 || cnt == 5) return need;
                return 1;
            } else {
                return 6 - len;
            }
        }
        while (!que.isEmpty() && len > 20) {
            int now = que.poll();
            ++ans;--len;
            if (--now >= 3) que.add(now);
        }
        if (len > 20) ans += len - 20 + Math.max(0, need);
        else {
            int cunt = 0;
            while (!que.isEmpty()) {
                int now = que.poll();
                cunt += now / 3;
            }
            ans += Math.max(cunt, need);
        }
        return ans;
    }
}
