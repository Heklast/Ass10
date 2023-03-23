package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/

public class PlusComposite extends SuperClass implements MathExpression, Observer {

    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;

    }

}

