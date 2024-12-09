public class CreditCard {
    //Instance variables
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor to initialize the credit card with a cardholder and a credit limit
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0); // balance is set to zero
    }

    //Method to get the current balance
    public Money getBalance() {
        return new Money(balance); // Return new Money to prevent modification of the original balance

    }

    // Method to get the credit limit
    public Money getCreditLimit() {
        return this.creditLimit;

    }

    // Method to get the personal info
    public String getPersonals() {
        return this.owner.toString(); // Return the owner's info

    }

    // Method to charge an amount to credit card
    public void charge(Money amount) {
        // Calculates the new balance after the charge
        Money NewAmount = amount.add(balance);

        // Checks if the new balance exceeds the credit limit
        if (creditLimit.compareTo(NewAmount) >= 0) {
            // Updates the balance
            balance = NewAmount;
            // Prints the charge amount
            System.out.printf("%5s%5s%n", "Charge:", amount);
        } else {
            // Prints a message if the charge exceeds the limit
            System.out.printf("%5s%n", "Exceeds credit limit");
        }
    }

    // Method to make a payment to reduce balance on credit card
    public void payment(Money amount) {

        // Subtract the payment amount from the balance
        balance = balance.subtract(amount);
        // Print the new balance after payment
        System.out.println("Payment: " + balance);

    }

}
