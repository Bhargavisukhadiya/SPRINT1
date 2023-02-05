package model.interfaces;

//import jdk.internal.org.objectweb.asm.tree.InsnList;
import main.Shape;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.StartAndEndPointMode;

import java.util.ArrayList;

public interface IApplicationState {
    void setActiveShape();

    void setActivePrimaryColor();

    void setActiveSecondaryColor();

    void setActiveShadingType();

    void setActiveStartAndEndPointMode();

    void setShapelist(Shape shape);

    void setSelectedlist(Shape shape);

//    void setCopylist(Shape shape);

//    void setGrouplist(ArrayList<Shape> shape);

//    public ArrayList<Shape> getCopyList();

//    public ArrayList<ArrayList<Shape>> getGroupList();

    public ArrayList<Shape> getShapelist();

    public ArrayList<Shape> getSelectedlist();

    public void remove(Shape s);

    public boolean check(Shape shape);

    ShapeType getActiveShapeType();

    ShapeColor getActivePrimaryColor();

    ShapeColor getActiveSecondaryColor();

    ShapeShadingType getActiveShapeShadingType();

    StartAndEndPointMode getActiveStartAndEndPointMode();


}
