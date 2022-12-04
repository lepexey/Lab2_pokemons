package attacks;

import ru.ifmo.se.pokemon.*;

public class NobleRoar extends StatusMove {
    public NobleRoar() {
        super(Type.NORMAL, 1, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        Effect e1 = new Effect().stat(Stat.ATTACK, -1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(e1);
        pokemon.addEffect(e2);
    }

    @Override
    protected String describe() {
        return "применяет Noble Roar";
    }
}
