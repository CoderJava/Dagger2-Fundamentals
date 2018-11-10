package example_2_with_dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class BraavosModule {

    Cash cash;
    Soldier soldier;

    public BraavosModule(Cash cash, Soldier soldier) {
        this.cash = cash;
        this.soldier = soldier;
    }

    @Provides
    Cash provideCash() {
        return cash;
    }

    @Provides
    Soldier provideSoldier() {
        return soldier;
    }

}
