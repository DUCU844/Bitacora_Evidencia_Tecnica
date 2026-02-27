package dosw.bitacora.Semana3.Command;

public class DefendCommand implements Command {

    private GameCharacter character;

    public DefendCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.defend();
    }
}
