public class Car {

    // ii. Instance variable model
    String model;

    // iii. Instance variable year
    int year;

    // iv. Class variable dealer
    static String dealer;

    // v. Instance method
    void printCarDetails(String model, int year) {
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
    }

    // vi. Class method
    static void printDealer() {
        System.out.println("Dealer: " + dealer);
    }
}
public class GarageTest {
    public static void main(String[] args) {

        // x. Create Car object
        Car c1 = new Car();

        // xi. Assign model name
        c1.model = "Honda Civic";

        // xii. Assign year
        c1.year = 2022;

        // xiii. Set dealer
        Car.dealer = "Auto Galaxy";

        // xiv. Print car details
        c1.printCarDetails();

        // xv. Print dealer
        Car.printDealer();
    }
}
