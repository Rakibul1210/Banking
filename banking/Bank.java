package banking;

public class Bank {
    public Bank(){

    }

    public void start_banking(){
        String rakibul_pin = "1210";
        String rafsan_pin = "0502";

        Account rakibul = new Account("Rakibul", "01740739402", rakibul_pin);
        Account rafsan = new Account("Rafsan", "01997330681");

        System.out.println(rakibul);

        System.out.println(rafsan);

        rafsan.pin_update(rafsan_pin, "4321");
        rakibul.add_money(1500);
        rafsan.add_money(2000);

        rakibul.cash_out(1000, "1234");
        rakibul.cash_out(1200, "1210");


        if (rakibul.pin_update("1210", "1234"))
            rakibul_pin = "1234";
        else
           rakibul_pin = rakibul_pin;

        /*
        Pin Update ... ternary way
        rakibul_pin = rakibul.pin_update("1234","1122") ? "1122" : rakibul_pin;
        */

        rakibul.cash_out(1000, "1210");
        rakibul.cash_out(1000, "1234");

        System.out.println(rakibul);
        System.out.println(rafsan);

    }
}