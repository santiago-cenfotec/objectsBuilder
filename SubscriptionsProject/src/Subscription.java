public class Subscription {

    //ENUM PARA TIPO Y PRECIO
    public enum SubscriptionType {
        BASIC(4.99),
        COUPLE(9.99),
        PREMIUM(14.99);

        private double price;

        SubscriptionType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    //ENUM PARA PERIODICIDAD
    public enum BillingBasis {
        MONTHLY, QUARTERLY, ANNUAL;
    }


    SubscriptionType typeSubs;
    BillingBasis billingBasis;

    public Subscription(SubscriptionType typeSubs, BillingBasis billingBasis) {
        this.typeSubs = typeSubs;
        this.billingBasis = billingBasis;
    }

}
