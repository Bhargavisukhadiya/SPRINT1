package main;

//import extras.EllipseShape;
//import extras.TriangleShape;
import model.ShapeType;
import model.interfaces.IApplicationState;
import view.interfaces.PaintCanvasBase;

class getShapeGoFactory {
    private Pointers startPointers;
    private Pointers endPointers;
    private PaintCanvasBase paintCanvas;
    private IApplicationState appState;


    public void getShape(IApplicationState appState, Pointers startPointers, Pointers endPointers, PaintCanvasBase paintCanvas) {
        if (appState.getActiveShapeType().equals(ShapeType.RECTANGLE)) {
            Shape shep = new RectangleLoveShape(startPointers, endPointers, paintCanvas, appState);
            shep.drawShape();
            appState.setShapelist(shep);

        }
        /*if (appState.getActiveShapeType().equals(ShapeType.ELLIPSE)) {
            Shape ellipse = new EllipseShaping(startPointers, endPointers, paintCanvas, appState);
            ellipse.drawShape();
            appState.setShapelist(ellipse);

        }
        if (appState.getActiveShapeType().equals(ShapeType.TRIANGLE)) {
            Shape tri = new TriangleLoveShape(startPointers, endPointers, paintCanvas, appState);
            tri.drawShape();
            appState.setShapelist(tri);

        }

*/
    }

}
