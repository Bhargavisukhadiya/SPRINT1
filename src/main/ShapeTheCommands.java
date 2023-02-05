package main;
import model.StartAndEndPointMode;
import model.interfaces.IApplicationState;
import view.interfaces.PaintCanvasBase;

public class ShapeTheCommands implements ICommand, IUndoable {
    private Pointers startPointers;
    private Pointers endPointers;
    private PaintCanvasBase paintCanvas;
    private IApplicationState appState;

    public ShapeTheCommands(Pointers startPointers, Pointers endPointers, PaintCanvasBase paintCanvas, IApplicationState appState) {
        this.startPointers = startPointers;
        this.endPointers = endPointers;
        this.paintCanvas=paintCanvas;
        this.appState=appState;
    }

    @Override
    public void runing() {

        if(appState.getActiveStartAndEndPointMode().equals(StartAndEndPointMode.DRAW)) {
            commandingStrategy draw= new drawCommandingStrategy(startPointers, endPointers,paintCanvas,appState);
            draw.executeCommand();
        }






    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

}



