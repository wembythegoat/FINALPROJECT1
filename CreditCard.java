public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance () {

    return new Money(balance);

    }

    public Money getCreditLimit () {
        return this.creditLimit;

    }

    public String getPersonals () {
        return this.owner.toString();

    }

    public void charge (Money amount) {
        Money NewAmount = amount.add(balance);
        if (creditLimit.compareTo(NewAmount) >= 0) {
            balance = NewAmount;
            System.out.printf("%5s%5s%n", "Charge:", amount);
        } else {
            System.out.printf("%5s%n", "Exceeds credit limit");
        }
    }
    public void payment (Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + balance);

    }

}
