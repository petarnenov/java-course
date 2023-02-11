public class Problems {
    static int p58(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }

    static boolean p242(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c);
            if (index != -1) {
                t = t.substring(0, index) + t.substring(index + 1, t.length());
            } else {
                return false;
            }
        }
        return true;
    }

    static String p168(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char result = (char) ('A' + (columnNumber % 26));
            sb.append(result);

            columnNumber /= 26;
        }
        sb.reverse();
        return sb.toString();
    }

    static int p177(String s) {
        s = s.trim();
        long result = 0L;
        int sign = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' && i == 0) {
                continue;
            }
            if (c == '-' && i == 0) {
                sign = -1;
                continue;
            }
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
               break;
            }
        }
        if (sb.length() > 0) {
            for(int i = 0; i < sb.length(); i++) {
                result = result * 10L +(long) (sb.charAt(i) - '0');
                if (result > Integer.MAX_VALUE) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if(result < Integer.MIN_VALUE) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
        }
        return (int)result*sign;
    }

}
