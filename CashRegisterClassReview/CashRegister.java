package CashRegisterClassReview;

public class CashRegister {
    // item count int is fine since there cant be half an item
    int itemCount;
    // double total to account for cents
    double cashRegisterTotal;
    // static shared by all registers
    static double allCashRegisterTotals = 0;

    // constructor base
    public CashRegister() {
        // sets count to 0
        this.itemCount = 0;
        // set total to 0
        this.cashRegisterTotal = 0;
    }

    // constructor with a starting balance -- preloaded registers
    public CashRegister(double startingBalance) {
        this.cashRegisterTotal = startingBalance;
        this.itemCount = 0;
        // adds preload to all totals
        allCashRegisterTotals+=startingBalance;
    }

    // overload
    public String toString() {
        return("\nRegister total: $" + cashRegisterTotal + "\nTotal Register: $" + allCashRegisterTotals +
        "\nCurrent item count: " + itemCount);
    }

    // mutators

    public void addItem(double item) {
        // ups item count
        itemCount++;
        // adds item cost to the current register total
        cashRegisterTotal+=item;
        // adds item to all register total
        allCashRegisterTotals+=item;
    }
    public void removeItem(double item) {
        // lowers item count
        itemCount--;
        // subtracts item cost from current register
        cashRegisterTotal-=item;
        // subtracts from global register
        allCashRegisterTotals-=item;
    }

    // accessors

    public double getCashRegisterTotal() {
        // returns cash register total
        return cashRegisterTotal;
    }
    public int getCount() {
        // returns item count
        return itemCount;
    }
    public double getAllCashRegisterTotals() {
        // returns global register total
        return allCashRegisterTotals;
    }

    // mutator
    public void clearSingle() {
        // sets item count total
        itemCount = 0;
        // removes this register from global
        allCashRegisterTotals = allCashRegisterTotals-cashRegisterTotal;
        // sets local to 0
        cashRegisterTotal = 0;
    }
}
