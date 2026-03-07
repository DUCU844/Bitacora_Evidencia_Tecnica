package dosw.bitacora.Semana2.patrones.Memento;

import java.util.Stack;

public class GameHistory {

    private Stack<GameMemento> history = new Stack<>();

    public void save(GameMemento memento) {
        history.push(memento);
    }

    public GameMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
