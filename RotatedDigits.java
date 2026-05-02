public class RotatedDigits {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            StringBuilder s = new StringBuilder(String.valueOf(i));
            StringBuilder temp = new StringBuilder("");

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1' || s.charAt(j) == '0' || s.charAt(j) == '8') {
                    temp.append(s.charAt(j));
                } else if (s.charAt(j) == '2') {
                    temp.append('5');
                } else if (s.charAt(j) == '5') {
                    temp.append('2');
                } else if (s.charAt(j) == '6') {
                    temp.append('9');
                } else if (s.charAt(j) == '9') {
                    temp.append('9');
                }
                else {
                    break;
                }

            }
            if (temp.length() == s.length() && s.compareTo(temp) != 0) {
                System.out.println(s);
                count++;
            }
        }
        return count;
    }
}
