

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

/*
class Investigator extends Characters{
	public Investigator() {
		specialPower = new Investigate();
		isAlive = true;
		isProtected = false;
		playerNumber = 2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
class Bodyguard extends Characters{
	public Bodyguard() {
		specialPower = new Protect();
		isAlive = true;
		isProtected = false;
		playerNumber = 3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}

class SerialKiller extends Characters{
	public SerialKiller() {
		specialPower = new Kill();
		isAlive = true;
		isProtected = false;
		playerNumber = 5;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
class Mafioso extends Characters{
	public Mafioso() {
		specialPower = new Murder();
		isAlive = true;
		isProtected = false;
		playerNumber = 6;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}


 */






















