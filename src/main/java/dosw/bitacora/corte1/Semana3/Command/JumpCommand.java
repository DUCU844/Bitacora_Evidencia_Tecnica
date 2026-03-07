package dosw.bitacora.Semana3.Command;

public class JumpCommand implements Command{

    private GameCharacter character;

    public JumpCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
