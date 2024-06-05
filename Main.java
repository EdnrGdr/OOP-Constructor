public class Main {

    public static void main ( String [] args) {

        Account account1 = new Account();

     /* Asagıda. getter ve setter ile Account sınıfından özellik cagırabildik Ama tek tek yapmak zor. Constructor ile yapılmalı.

        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Eda");
        account1.setEmail("ednr@hotmail.com");
        account1.setTelefonNo("05300000000");

        System.out.println("Bakiye: " + account1.getBakiye());
      */

        Account account2= new Account("1231245",1000.0,"Eda","fdlşl@gmail.com","054645");

        account2.paraYatir(500);
        account2.paraCekme(700);
        account2.paraCekme(2000.);


        




    }
}
