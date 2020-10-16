public class GreenLantern extends SuperHero{

    public GreenLantern(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){


        return (fields[9]) = 'Female';
    }

    public void attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        damage += this.getSpeed()  - oHero.getSpeed();

        return damage;

    }

    public static boolean SubCondition(String[] fields){
        return true;
    }
}
