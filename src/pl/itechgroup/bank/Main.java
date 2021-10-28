package pl.itechgroup.bank;

public class Main {
    public static void main(String[] args) {
        String string = "55";
        int length;
        try {
            length = string.length();
            System.out.println(length);
        }
        catch (Exception e){
            System.out.println(0);
        }
    }
}