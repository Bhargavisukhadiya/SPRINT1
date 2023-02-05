package main;

public class undoTheCommands implements ICommand{
    @Override
    public void runing() {
        CommandStory.undo();
    }
}
