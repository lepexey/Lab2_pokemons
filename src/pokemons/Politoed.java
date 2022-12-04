package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        setStats(90, 75, 75, 90, 100, 70);
        setMove(new BubbleBeam(), new Blizzard(), new BellyDrum(), new Scald());
    }
}
