package dosw.bitacora.Semana2.patrones.Memento;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(1, 0);
        GameHistory history = new GameHistory();

        game.showState();

        history.save(game.save());

        game.setLevel(2);
        game.setScore(150);
        game.showState();

        history.save(game.save());

        game.setLevel(3);
        game.setScore(300);
        game.showState();

        game.restore(history.undo());
        game.showState();
    }
}
