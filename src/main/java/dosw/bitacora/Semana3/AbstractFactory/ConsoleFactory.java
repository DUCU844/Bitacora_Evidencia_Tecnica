package dosw.bitacora.Semana3.AbstractFactory;


public interface ConsoleFactory{
    Controller createController();
    Game createGame();
    UI createUI();
}
