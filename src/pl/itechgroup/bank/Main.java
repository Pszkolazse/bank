package pl.itechgroup.bank;

public class Main {
    public static void main(String[] args) {
        String string = "nfoanmxroce";
        char chars[] = new char[7];

        for (int i = 0; i < string.length(); i++) {
            try {
                chars[i] = string.charAt(i);
            }
            catch (Exception e)
            {
                continue;
            }
        }

        System.out.println(chars);
    }
}