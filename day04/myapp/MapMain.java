package myapp;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;

public class MapMain {

    public static void main (String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        for(String n: names){
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountId(), acct);
        }
        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");



        // Create a simple Map, accts.put(value.key,value)
        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountId(),fred);
        accts.put(barney.getAccountId(),barney);
        accts.put(wilma.getAccountId(),wilma);
        accts.put(betty.getAccountId(),betty);

        System.out.printf("Size: %d\n", accts.size());
        System.out.printf("has fred: %d\n", accts.containsKey(fred.getAccountId()));
        System.out.printf("has pebbles: %d\n", accts.containsKey("pebbles"));

        Set<String> keys =  accts.keySet();
        Collection<BankAccount> values = accts.values();
        
        // for-each loop for sets and arrays
        BankAccount acct;
        for(String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n", acctId, acct.getName());

        }
    }


}