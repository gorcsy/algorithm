package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            try {
                int num = Integer.parseInt(String.valueOf(input.charAt(i)));
                sum += num;
            } catch (NumberFormatException ex) {
                
            }
        }
        return sum;
    }
}
