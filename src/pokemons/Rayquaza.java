package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Rayquaza extends Pokemon {
    public Rayquaza(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.FLYING);
        setMove(new FireBlast(), new DoubleTeam(), new Overheat(), new BulkUp());
    }
}
