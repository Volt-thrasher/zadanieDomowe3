public class New {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar();
        guitar1.producer = "Cort";
        guitar1.colour = "Black";
        guitar1.strings = 6;
        guitar1.electric = true;

        Guitar guitar2 = new Guitar();
        guitar2.producer = "Fender";
        guitar2.colour = "Blue";
        guitar2.strings = 12;
        guitar2.electric = false;

        System.out.println("Producer: "+guitar1.producer+" Colour: "+guitar1.colour+" Strings: "+guitar1.strings
                +" Electric? "+guitar1.electric);
        System.out.println("Producer: "+guitar2.producer+" Colour: "+guitar2.colour+" Strings: "+guitar2.strings
                +" Electric? "+guitar2.electric);
    }
}
