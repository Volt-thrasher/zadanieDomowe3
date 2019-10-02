public class New {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar("Cort", "Black", 6, true);

        Guitar guitar2 = new Guitar("Fender", "Blue", 12, false);

        System.out.println("Producer: "+guitar1.producer+" Colour: "+guitar1.colour+" Strings: "+guitar1.strings
                +" Electric? "+guitar1.electric);
        System.out.println("Producer: "+guitar2.producer+" Colour: "+guitar2.colour+" Strings: "+guitar2.strings
                +" Electric? "+guitar2.electric);
    }
}
