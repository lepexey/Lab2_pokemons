package pokemons;

import attacks.NobleRoar;
import attacks.Swagger;
import attacks.Waterfall;

public class Wailord extends Wailmer {

    public Wailord(String name, int level) {
        super(name, level);
        setStats(170, 90, 45, 90, 45, 60);
        super.setMove(new Waterfall(), new Swagger(), new Waterfall(), new NobleRoar());
    }
}
