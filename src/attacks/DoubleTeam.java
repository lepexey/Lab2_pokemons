package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        Effect e = new Effect().stat(Stat.EVASION, 1);
        pokemon.addEffect(e);
    }


    @Override
    protected String describe() {
        return "использует Double Team";
    }
}
