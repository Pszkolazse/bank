package pl.itechgroup.bank;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("40i4", "Mickiewicz", "6g9wv59w9",55, 178),
                new Person("Kamil", "Skipp", "82q65v8tc",36, 177),
                new Person("Mikolaj", "Sandor", "661dsf[dd",41, 163));
        persons.forEach(System.out::println);
        System.out.println("--------------");
        Set<Account> accounts = Set.of(new Account("malinka22", "gn9s43^#rf", "malinka@gmail.com", 5225, 5554),
                new Account("kamik" , "kamkam2894", "kamilK@poczta.onet.pl", 5531, 112));
        accounts.forEach(System.out::println);
        System.out.println("--------------");
        Map<Integer, Transwer> transwers= Map.of(1,new Transwer(51.5f, "PKO", 11.2f),
                2, new Transwer(994f, "BNP", 126.2f),
                3, new Transwer(511.5f, "LOS", 122f));
        transwers.forEach((integer, transwer) -> {transwer.getInfo();});
    }
}
