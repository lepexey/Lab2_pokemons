package attacks;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp() {
        super(Type.FIGHTING, 0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        Effect e1 = new Effect().stat(Stat.ATTACK, 1);
        Effect e2 = new Effect().stat(Stat.DEFENSE, 1);
        pokemon.addEffect(e1);
        pokemon.addEffect(e2);
    }

    @Override
    protected String describe() {
        return "применяет Bulk up";
    }
}
