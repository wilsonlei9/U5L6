import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        BankApp app = new BankApp();
        // call methods from your BankApp object to handle program logic
        boolean end = false;
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        Bank bank = new Bank();
        BagelShop shop = new BagelShop("shop", 1000, 2, bank);
        CreditCard card = new CreditCard(name, "9254");
        CreditCard card2 = new CreditCard(name, "9255");
        app.option();
        while(end == false)
        {
            int option = s.nextInt();
            if(option == 2)
            {
                System.out.println("How much money do you want to pay?");
                int amount = s.nextInt();
                card.chargeCard(amount);
                System.out.println(card.getBalanceOwed());
                app.option();
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
                System.out.println("Opened new card");
            }
            if(option == 4)
            {
                if (card.getBalanceOwed() > card2.getBalanceOwed())
                {
                    System.out.println("Card 1 has more balance owed than card 2.");
                }
                else if(card.getBalanceOwed() < card2.getBalanceOwed())
                {
                    System.out.println("Card 2 has more balance owed than card 1.");
                }
                else {
                    System.out.println("Both cards have the same balance owed.");
                }
            }
            if(option == 5)
            {
                shop.depositProfits();
                System.out.println("Deposit successful");
            }
            if(option == 6)
            {
                System.out.println(shop);
            }
            if(option == 7)
            {
                end = true;
            }
        }

    }
}


