package is.hi.hbv202g.ass9.composite;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class NumberLeaf implements MathExpression {
    private int number;

    public NumberLeaf(int result) {
        this.number = result;
    }

    public int getResult() {
        return number;

    }
}
