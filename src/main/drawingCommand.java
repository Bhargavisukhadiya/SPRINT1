package main;

import model.interfaces.IApplicationState;
import view.interfaces.PaintCanvasBase;

import java.util.ArrayList;

public class drawingCommand implements ICommand, IUndoable {
    private Pointers startPointers;
    private Pointers endPointers;
    private PaintCanvasBase paintedCanvas;
    private IApplicationState appState;
    ArrayList<Shape> redo= new ArrayList<Shape>();

    public drawingCommand(Pointers startPointers, Pointers endPointers, PaintCanvasBase paintedCanvas, IApplicationState appState){
        this.startPointers = startPointers;
        this.endPointers = endPointers;
        this.paintedCanvas = paintedCanvas;
        this.appState=appState;

    }
    @Override
    public void runing() {
        CommandStory.add(this);
        getShapeGoFactory get = new getShapeGoFactory();
        get.getShape(appState, startPointers, endPointers, paintedCanvas);
    }

    @Override
    public void undo() {
        System.out.println("drawCommand");
        appState.getShapelist();
        for(int i=appState.getShapelist().size()-1;i>=0;i--){
            appState.getShapelist().get(i).clearShape();
            redo.add(appState.getShapelist().get(i));
            appState.getShapelist().remove(appState.getShapelist().get(i));
            break;

        }





    }


    @Override
    public void redo() {

       for(Shape s: redo){
           s.drawShape();
           redo.remove(s);
           appState.getShapelist().add(s);
        }


    }
}
