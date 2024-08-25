import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String name){
        bankName = name;
        accounts = new ArrayList<Account>();
    }

    public boolean openAccount(long accountNumber, String customerName, double balance){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return false;
            }
        }
        if (balance<=0){
            return false;
        }
        accounts.add(new Account(accountNumber,customerName,balance));
        return true;
    }

    public double closeAccount(long accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                accounts.remove(account);
                return account.getBalance();
            }
        }
        return -1;
    }

    public void setName(String name){
        bankName = name;
    }
    public String getName(){
        return bankName;
    }
    public Account getAccount(long accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
    public ArrayList<Account> getAccounts(){
        return accounts;
    }


}
