package tema3;

public class Main {
    public static void main(String[] args) {

        SmartDevice sp = new SmartPhone("Redmi", "Note 9 pro", "14f23c07",
                                        6, 128, true);
        System.out.println(sp);

        SmartDevice sw = new SmartWatch("Samsung", "Galaxy Watch 40mm", "34i678l0",
                                        true, true, true);
        System.out.println(sw);
    }

}
