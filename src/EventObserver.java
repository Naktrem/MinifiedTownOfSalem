public class EventObserver implements Observer {

    @Override
    public void update(Character character) {
        character.getSpecialPower().printSpecialPowerStatus();
    }
}
