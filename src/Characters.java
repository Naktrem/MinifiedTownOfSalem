

public abstract class Characters {
    SpecialPower specialPower;
    private static boolean isAlive;
    private static boolean isProtected;


    private static boolean isBusy;

    int playerNumber;


    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public static boolean isAlive() {
        return isAlive;
    }

    public static void setAlive(boolean isAlive) {
        Characters.isAlive = isAlive;
    }

    public static boolean isProtected() {
        return isProtected;
    }

    public static void setProtected(boolean isProtected) {
        Characters.isProtected = isProtected;
    }

    public static boolean isBusy() { return isBusy; }

    public static void setBusy(boolean isBusy) { Characters.isBusy = isBusy; }


    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public abstract void display();
}
































