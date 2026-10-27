class Solution {
    int pos = 0;
    
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;
        
        while (pos < s.length()) {
            char c = s.charAt(pos);
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                pos++;
            } else if (c == '[') {
                pos++;
                String inner = decodeString(s);
                for (int i = 0; i < num; i++) result.append(inner);
                num = 0;
            } else if (c == ']') {
                pos++;
                return result.toString();
            } else {
                result.append(c);
                pos++;
            }
        }
        
        return result.toString();
    }
}