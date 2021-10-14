package lesson7;

public class MainApp {
    public static void main(String[] args) {

        Toy toy = new Toy("Teddy");
        ToyBox toyBox = new ToyBox();
        toyBox.open();
        toyBox.putToy(toy);
        toyBox.close();
        System.out.println(toyBox.extractToy());
        toyBox.open();
        Toy extractedToy = toyBox.extractToy();
        if(extractedToy != null) {
            System.out.println(extractedToy.getName());
        }
    }
}
