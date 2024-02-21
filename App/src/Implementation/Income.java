package Implementation;

public class Income {
    User user;
    double income;

    public Income(User user, double income) {
        this.user = user;
        this.income = income;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
