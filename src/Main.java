public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account("12345",
//                1000.00,
//                "Bob Brown",
//                "myemail@bob.com",
//                "(91) 8978 5678");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(91) 1234 5678");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        Account timsAccount = new Account("Tim",
                "tim@email.com",
                "12345");
        System.out.println("Account No: " + timsAccount.getNumber() + " ; name " + timsAccount.getCustomerName());
    }
}
