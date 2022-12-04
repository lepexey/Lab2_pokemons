package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        setStats(65, 65, 65, 50, 50, 90);
        setMove(new BubbleBeam(), new Blizzard(), new BellyDrum());
    }
}
