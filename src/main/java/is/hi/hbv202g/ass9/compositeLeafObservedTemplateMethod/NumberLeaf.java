package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class NumberLeaf extends Observable implements MathExpression {
    private int number;

    public NumberLeaf(int result) {
        this.number = result;
    }

    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }

    public int getResult() {
        return number;

    }
}
