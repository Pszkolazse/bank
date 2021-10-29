package pl.itechgroup.bank;

public class Main {
    public static void main(String[] args) {
        String string = "nfoanmxroce";
        char chars[] = new char[8];

        for (int i = 0, a = 0; i < string.length(); i++) {
            try {
                chars[i] = string.charAt(i);
            }
            catch (Exception e)
            {
                break;
            }
            finally {
                System.out.println(i);
            }



        }



        System.out.println(chars);
    }
}