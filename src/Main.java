public class Main {
    public static void main(String[] args) {

        EventObserver eventObserver = new EventObserver();

        Doctor doc = new Doctor();

        doc.registerObserver(eventObserver);

        doc.useSpecialPower();


    }
}
