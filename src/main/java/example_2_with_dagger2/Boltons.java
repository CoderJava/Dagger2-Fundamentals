package example_2_with_dagger2;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons() {
    }

    @Override
    public void prepareForWar() {
        // TODO: 11/10/18 do something in here
        System.out.println(getClass().getSimpleName() + " prepared for war.");
    }

    @Override
    public void reportForWar() {
        // TODO: 11/10/18 do something in here
        System.out.println(getClass().getSimpleName() + " reporting.");
    }
}
