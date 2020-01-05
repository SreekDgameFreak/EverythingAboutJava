package projects.pluralsight.calengine;

public class Main {

    public static void main(String[] args){

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d,50.0d,'d');
        equations[1] = create(123.0d,513.5d,'a');
        equations[2] = create(125.0d,50.5d,'s');
        equations[3] = create(100.0d,50.0d,'m');

        for (MathEquation m:
             equations) {
            m.execute();
            System.out.println("result = " + m.getResult());
        }

    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation  mathEquation = new MathEquation();

        mathEquation.setLeftVal(leftVal);
        mathEquation.setRightVal(rightVal);
        mathEquation.setOpCode(opCode);

        return mathEquation;
    }

}