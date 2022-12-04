import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class BattleStart {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Rayquaza rayquaza = new Rayquaza("Rayquaza", 5);
        Wailord wailord = new Wailord("WailSon", 4);
        Wailmer wailmer = new Wailmer("WailFather", 6);
        Politoed politoed = new Politoed("Polite", 7);
        Poliwag poliwag = new Poliwag("PoliteDed", 9);
        Poliwhirl poliwhirl = new Poliwhirl("PoliteFather", 5);

        battle.addFoe(rayquaza);
        battle.addFoe(wailmer);
        battle.addFoe(poliwag);
        battle.addAlly(poliwhirl);
        battle.addAlly(wailord);
        battle.addAlly(politoed);

        battle.go();
    }
}