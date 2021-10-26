package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jordan", "Person", "00000000", 45, 169);
        Account account = new Account("kombjp", "1111", "jordanyppppppp@poczta.onet.pl", 5751, 10);
        Transwer transwer = new Transwer(account.money, "PKO Bank", 5.5f);

        person.getInfo();
        account.getInfo();
        transwer.getInfo();

        for (int i = 1; i < 1000; i += 2) {
            System.out.println(i);
        }
        int indexer = 1;
        while (indexer < 1000) {
            System.out.println(indexer);
            indexer += 2;
        }

        DniTygodnia DN = DniTygodnia.PN;
        System.out.println(DN.number);
        System.out.println("---------------------");
        dividedBy(951, 10);

        Object[][] tab = new Object[][]{
                new Integer[] { 1, 2,5,9,7},
                new Boolean[]{true, false, false, true},
                new String[] {"56g", "edf"}
        };
        tableIteration(tab);
    }

    static void tableIteration(Object tab[][])
    {
        System.out.print("  ");
        for (int i = 0; i < tab[0].length; i++) {

            System.out.print(i+" ");
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print("\n"+(i)+":");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]+" ");
            }
        }
    }



    public static void dividedBy(int count, int number)
    {
        int counter = 0, index = 0;
        while (true)
        {
            index++;
            if (counter>=count)
                break;
            if (index%number!=0)
                continue;
            counter++;
            System.out.println(counter+":"+index);
        }
    }





    public enum DniTygodnia
    {
        PN("PN", "Poniedziałek", 1);
        String code, name;
        int number;

        DniTygodnia(String code, String name, int number) {
            this.code = code;
            this.name = name;
            this.number = number;
        }
    }
}
