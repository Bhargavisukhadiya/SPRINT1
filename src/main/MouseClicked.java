package main;


import model.interfaces.IApplicationState;
import view.interfaces.PaintCanvasBase;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MouseClicked extends MouseAdapter  {
    private Pointers startPointers;
    private Pointers endPointers;
    private  PaintCanvasBase paintCanvas;
    private ICommand command;
    private IApplicationState appState;

    MouseClicked(PaintCanvasBase paintCanvas, IApplicationState appState){
        this.paintCanvas=paintCanvas;
        this.appState=appState;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

      //  System.out.println(e.getX()+","+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

            startPointers = new Pointers(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        endPointers = new Pointers(e.getX(),e.getY());
        command= new ShapeTheCommands(startPointers, endPointers,paintCanvas,appState);
        command.runing();


    }


}
