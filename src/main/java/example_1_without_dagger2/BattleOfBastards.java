package example_1_without_dagger2;

public class BattleOfBastards {
    public static void main(String[] args) {
        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        War war = new War(starks, boltons);
        war.prepare();
        war.report();
    }
}
