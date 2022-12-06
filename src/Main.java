import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        BankApp app = new BankApp();
        // call methods from your BankApp object to handle program logic
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        Bank bank = new Bank();
        BagelShop shop = new BagelShop("shop", 1000, 2, bank);
        CreditCard card = new CreditCard(name, "9254");
        app.option();
        int option = s.nextInt();

        if(option == 2)
        {
            System.out.println("How much money do you want to pay?");
            int amount = s.nextInt();
            card.chargeCard(amount);
        }
        if(option == 1)
        {
            System.out.println("Would you like to buy or return?");
            String a = s.nextLine();
            if(a.equals("buy"))
            {
                System.out.println("How much do you want to buy?");
                int amount = s.nextInt();
                shop.payForBagels(card, amount, "9254");

            }
            if(a.equals("return"))
            {
                System.out.println("How much do you want to return?");
                int amount = s.nextInt();
                shop.returnBagels(card, amount, "9254");
            }
        }
        if(option == 3)
        {
            CreditCard card2 = new CreditCard(name, "9255");
        }
        if(option == 4)
        {

        }
    }
}


