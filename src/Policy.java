public class Policy {
    String policy_number;
    String holder_name;
    double premium_amount;

    public Policy(String policy_number, String holder_name, double premium_amount) {
        this.policy_number = policy_number;
        this.holder_name = holder_name;
        this.premium_amount = premium_amount;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public double getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(double premium_amount) {
        this.premium_amount = premium_amount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policy_number='" + policy_number + '\'' +
                ", holder_name='" + holder_name + '\'' +
                ", premium_amount=" + premium_amount +
                '}';
    }
}
