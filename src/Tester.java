// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tester {
    public static void main(String[] args) {
        String[]residents = {"Stefano","Onofrio", "Anna"};
        House house = new House();
        house.setAddress("via strasburgo 25");;
        house.setFloorsNumber(4);
        house.setResidentNames(residents);

        String formatted = String.format(house.getAddress(),house.getFloorsNumber(), String.join(", ", house.getResidentNames()));
        System.out.println(formatted);
    }
    }