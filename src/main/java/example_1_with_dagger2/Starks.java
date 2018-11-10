package example_1_with_dagger2;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks() {
    }

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
