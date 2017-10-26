package interviewtopic;

/**
 * Created by DELL on 2017/10/26.
 */
public class MinNum {
    public static void main(String[] args) {
        String s = getMinNum("1432219",2 );
        System.out.println(s);
    }

    public static String getMinNum(String s, int k) {
        char[] chars = s.toCharArray();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < chars.length - 1; i++) {
            if (count == k) {
                break;
            }
            if (chars[i] > chars[i + 1]) {
                chars[i] = 0;
                count++;
            }
            if (chars[i] == chars[i + 1]) {
                flag = true;
            }
        }
        if (count == k) {
            flag = false;
        }
        if (!flag) {
            for (int i = count; i < k; i++) {
                for (int j = chars.length - 1; ; j--) {
                    if (chars[j] != 0) {
                        chars[j] = 0;
                        break;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                if (c != 0) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != 0) {
                sb.append(c);
            }
        }
        String str = sb.toString();
        String result = getMinNum(str, k - count);
        return result;
    }

}
