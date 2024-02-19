public class Transaction {
    User user;
    double amount;
    String method; //card or cash
    String category;

    public Transaction(User user, double amount, String method, String category) {
        this.user = user;
        this.amount = amount;
        this.method = method;
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
