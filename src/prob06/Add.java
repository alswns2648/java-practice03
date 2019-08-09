package prob06;

public class Add extends CalcApp{
	int cal;
	int result;
	int lval;
	int rval;

	public int calculate() {
		result = lval + rval;
		return result;
	}

	public void setValue(int lvalue, int rvalue) {
		this.lval = lvalue;
		this.rval = rvalue;
	}

}
