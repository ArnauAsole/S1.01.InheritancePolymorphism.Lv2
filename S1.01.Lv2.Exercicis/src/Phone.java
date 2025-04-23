
public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void calling(String number) {
        System.out.println("number: " + number + " is calling.");
    }

}
