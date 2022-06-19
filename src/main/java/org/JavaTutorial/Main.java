package org.JavaTutorial;
import java.util.Scanner;


public class Main{




    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        class bank{
            int accountid;
            String accountname;
            String accountlastname;
            long balance;
            String address;


            public bank(int accountid, String accountname, String accountlastname, long balance, String address) {
                this.accountid = accountid;
                this.accountname = accountname;
                this.accountlastname = accountlastname;
                this.balance = balance;
                this.address = address;
            }


            public int getAccountid() {
                return accountid;
            }

            public void setAccountid(int accountid) {
                this.accountid = accountid;
            }

            public String getAccountname() {
                return accountname;
            }

            public void setAccountname(String accountname) {
                this.accountname = accountname;
            }

            public String getAccountlastname() {
                return accountlastname;
            }

            public void setAccountlastname(String accountlastname) {
                this.accountlastname = accountlastname;
            }

            public long getBalance() {
                return balance;
            }

            public void setBalance(long balance) {
                this.balance = balance;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
            public long depositbalance(long x){
                return balance += x;
            }
            public long withdrawalbalance(long x){
                return balance -= x;
            }
        }
        bank bank1 = new bank(10, "Amir", "Salehi", 1500, "Bandar Abbas");
        System.out.println("Account ID: " + bank1.getAccountid() + "\n" + "Account name: " + bank1.getAccountname() + "\n" + "Account lastname: " + bank1.getAccountlastname() + "\n" + "Balance: " + bank1.getBalance());
        System.out.print("Want to deposit or withdrawal? ");
        String depositORwithdrawal = scan.next();
        if(depositORwithdrawal.equals("deposit")){
            System.out.print("deposit amount: ");
            bank1.depositbalance(scan.nextLong());
            System.out.println("New balance: " + bank1.getBalance());
        }else if(depositORwithdrawal.equals("withdrawal")){
            System.out.print("withdrawal amount: ");
            long withdrawalbalance = scan.nextLong();
            bank1.withdrawalbalance(withdrawalbalance);
            if(withdrawalbalance > bank1.getBalance())
            {
                System.out.println("You are broke!");
            }else
                System.out.println("New balance: " + bank1.getBalance());
        }









    }


}