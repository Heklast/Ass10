package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public abstract class SuperClass implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<MathExpression>();
    public int lastObservedResult;

    public abstract int getResult();

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public void add(MathExpression component) {
        children.add(component);
    }

    public void remove(MathExpression component) {
        children.remove(component);
    }

    public List<MathExpression> getChildren() {
        return children;
    }
}
