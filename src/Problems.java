public class Problems {
    static int p58(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }

    static boolean p242(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for(char c: s.toCharArray()) {
            int index = t.indexOf(c);
            if (index != -1) {
                t = t.substring(0, index) + t.substring(index + 1, t.length());
            } else {
                return false;
            }
        }
        return true;
    }

    static String p168(int columnNumber){
       StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char result = (char)('A' + (columnNumber % 26));
            sb.append(result);
            
            columnNumber /= 26;
        }
        sb.reverse();
        return sb.toString();
    }

}
