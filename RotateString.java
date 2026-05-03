public class RotateString {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s + s);
        if (s.length() != goal.length())
            return false;
        if (sb.indexOf(goal) != -1) {
            return true;
        }
        return false;
    }
}
