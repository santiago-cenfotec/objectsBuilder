import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Customer customer01 = new Customer("Santiago", "Campos", "Lizano", 119610475, 'M', "Sabana");

        Customer customer02 = new Customer("Allan", "Calderon", "Gonzales", 119610476, "Sabana");

        Customer customer03 = new Customer();

        Subscription sub01 = new Subscription(Subscription.SubscriptionType.BASIC, Subscription.BillingBasis.ANNUAL);

        Subscription sub02 = new Subscription(Subscription.SubscriptionType.PREMIUM, Subscription.BillingBasis.QUARTERLY);

        Subscription sub03 = new Subscription(Subscription.SubscriptionType.COUPLE, Subscription.BillingBasis.MONTHLY);

        customer01.subscribe(customer01, sub01);

    }

}