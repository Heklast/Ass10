package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

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


public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<MathExpression>();
    private int lastObservedResult;

    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;

    }

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

