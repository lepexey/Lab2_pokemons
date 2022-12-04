package attacks;

import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (Math.random() <= 0.1) {
            Effect e = new Effect().stat(Stat.SPEED, -1);
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "применяет Bubble Beam";
    }
}
