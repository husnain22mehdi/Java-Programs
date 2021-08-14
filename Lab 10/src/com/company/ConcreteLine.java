package com.company;

//Creating the abstract class AbstractLine
abstract class AbstractLine{

    //Defining the abstract methods
    public abstract double getLength();
    public abstract boolean isGreater(Object a, Object b);
    public abstract boolean isLess(Object a, Object b);
    public abstract boolean isEqual(Object a, Object b);
}

//Creating the concrete child class
public class ConcreteLine extends AbstractLine {

    //Declaring fields
    int x1;
    int y1;
    int x2;
    int y2;

    public ConcreteLine(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //Length getter
    @Override
    public double getLength() {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    //Overriding the abstract method isGreater()
    @Override
    public boolean isGreater(Object a, Object b) {
        ConcreteLine c = (ConcreteLine) a;
        ConcreteLine d = (ConcreteLine) b;
        return c.getLength() > d.getLength();
    }
    //Overriding the abstract method isLess()
    @Override
    public boolean isLess(Object a, Object b) {
        ConcreteLine c = (ConcreteLine) a;
        ConcreteLine d = (ConcreteLine) b;
        return c.getLength() < d.getLength();
    }
    //Overriding the abstract method isEqual()
    @Override
    public boolean isEqual(Object a, Object b) {
        ConcreteLine c = (ConcreteLine) a;
        ConcreteLine d = (ConcreteLine) b;
        return c.getLength() == d.getLength();
    }
}
