package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Wailmer extends Pokemon {
    public Wailmer(String name, int level) {
        super(name, level);
        setStats(130, 70, 35, 70, 35, 60);
        setType(Type.WATER);
        setMove(new Waterfall(), new Swagger(), new Waterfall());
    }
}
