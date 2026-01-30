public class Customer {
    String firstName;
    String lastNameOne;
    String lastNameTwo;
    int localID;
    char gender;
    String location;


    //Full
    public Customer(String firstName, String lastNameOne, String lastNameTwo, int localID, char gender, String location) {
        this.firstName = firstName;
        this.lastNameOne = lastNameOne;
        this.lastNameTwo = lastNameTwo;
        this.localID = localID;
        this.gender = gender;
        this.location = location;
    }


    //Partial
    public Customer(String firstName, String lastNameOne, String lastNameTwo, int localID, String location) {
        this.firstName = firstName;
        this.lastNameOne = lastNameOne;
        this.lastNameTwo = lastNameTwo;
        this.localID = localID;
        this.location = location;
    }


    //None
    public Customer(){

    }

    void subscribe (Customer customer, Subscription subscription){
        System.out.println("El cliente " + customer.firstName + " " + customer.lastNameOne + " tiene una subscripcion " + subscription.typeSubs.name() + " que cuesta " + subscription.typeSubs.getPrice() + " y lo paga en un " + subscription.billingBasis + " basis.");
    }
}
