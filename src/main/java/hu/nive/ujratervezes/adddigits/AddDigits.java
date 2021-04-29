package hu.nive.ujratervezes.adddigits;

public class AddDigits {


    public int addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        int res = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int num = Integer.parseInt(input.substring(i, i + 1));
                res += num;
            }
        }
        return res;
    }
}
