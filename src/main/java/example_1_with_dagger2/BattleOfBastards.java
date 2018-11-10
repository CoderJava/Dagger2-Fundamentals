package example_1_with_dagger2;


import dagger.Component;

@Component
interface BattleComponent {
    War getWar();
    /*Starks getStarks();*/
    /*Boltons getBoltons();*/
}

public class BattleOfBastards {

    public static void main(String[] args) {
        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();
    }

}
