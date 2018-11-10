package example_2_with_dagger2;

import dagger.Component;

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldier getSoldier();
}

public class BattleOfBastards {
    public static void main(String[] args) {
        Cash cash = new Cash();
        Soldier soldier = new Soldier();

        BattleComponent component = DaggerBattleComponent.builder()
                .braavosModule(new BraavosModule(cash, soldier))
                .build();
        War war = component.getWar();
        war.prepare();
        war.report();
    }
}
