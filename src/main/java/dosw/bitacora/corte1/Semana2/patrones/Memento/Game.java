package dosw.bitacora.Semana2.patrones.Memento;

public class Game {

    private int level;
    private int score;

    public Game(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showState() {
        System.out.println("Nivel: " + level + " | Puntaje: " + score);
    }

    public GameMemento save() {
        return new GameMemento(level, score);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
    }
}
