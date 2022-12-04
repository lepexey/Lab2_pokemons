package attacks;

import pokemons.Wailmer;
import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "применяет WaterPulse";
    }
}
