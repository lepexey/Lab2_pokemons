package attacks;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        pokemon.addEffect(new Effect().chance(0.3).condition(Status.BURN));
    }

    @Override
    protected String describe() {
        return "применяет Scald";
    }
}
