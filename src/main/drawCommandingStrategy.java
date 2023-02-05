package main;

import model.interfaces.IApplicationState;
import view.interfaces.PaintCanvasBase;

public class drawCommandingStrategy implements commandingStrategy {

    private Pointers startPointers;
    private Pointers endPointers;
    private PaintCanvasBase paintedCanvas;
    private IApplicationState applicationState;
    private ICommand drawings;
    public drawCommandingStrategy(Pointers startPointers, Pointers endPointers, PaintCanvasBase paintedCanvas, IApplicationState applicationState) {
        this.startPointers = startPointers;
        this.endPointers = endPointers;
        this.paintedCanvas = paintedCanvas;
        this.applicationState = applicationState;
    }

    public void executeCommand() {
        drawings = new drawingCommand(startPointers, endPointers, paintedCanvas, applicationState);
        drawings.runing();
    }
}
