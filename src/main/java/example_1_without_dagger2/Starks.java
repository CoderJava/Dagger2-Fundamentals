package example_1_without_dagger2;

public class Starks implements House {

    @Override
    public void prepareForWar() {
        // TODO: 11/10/18 do something in here
        System.out.println(getClass().getSimpleName() + " prepared for war");
    }

    @Override
    public void reportForWar() {
        // TODO: 11/10/18 do something in here
        System.out.println(getClass().getSimpleName() + " reporting.");
    }
}
