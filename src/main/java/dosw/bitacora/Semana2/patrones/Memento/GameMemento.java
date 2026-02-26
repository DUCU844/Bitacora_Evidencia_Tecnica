package dosw.bitacora.Semana2.patrones.Memento;

public class GameMemento {

    private final int level;
    private final int score;

    public GameMemento(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
