package attacks;

import ru.ifmo.se.pokemon.*;

public class BellyDrum extends StatusMove {
    public BellyDrum() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        Effect e = new Effect().stat(Stat.HP, (int) pokemon.getHP() / 2);
    }

    @Override
    protected String describe() {
        return "применяет Belly Drum";
    }
}
