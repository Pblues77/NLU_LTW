package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<Account>();
        Account a1 = new Account("admin@gmail.com", "0336677141", "admin", "Pblues", new Date(2003, 7, 7), "Viet Nam");
        this.accounts.add(a1);
    }

    public AccountManager(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void add(Account account) {
        this.accounts.add(account);
    }

    public boolean checkExist(String email_phone) {
        for (Account a : accounts) {
            if ((email_phone.equals(a.getEmail()) || email_phone.equals(a.getSdt())))
                return true;
        }
        return false;
    }

    public Account checkLogin(String email_phone, String pw) {
        for (Account a : accounts) {
            if ((email_phone.equals(a.getEmail()) || email_phone.equals(a.getSdt())) && pw.equals(a.getPassword()))
                return a;
        }
        return null;
    }
}
