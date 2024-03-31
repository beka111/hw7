package src;

public class Medic extends Hero {
    private int healPoints;

    public Medic() {
        super(120, 10, "HEALING");
        this.healPoints = 50;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbility);
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public class Warrior extends Hero {
    }
}

