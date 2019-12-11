public class EventObserver implements Observer {

    @Override
    public void update(Characters character) {
        character.getSpecialPower().printSpecialPowerStatus();
    }
}
