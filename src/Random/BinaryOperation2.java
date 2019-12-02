package Random;
import java.util.Random;
 abstract class BinaryOperation2 {
	 static final int UPPER = 100;
	 static final int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+'; 
	private int value = 0; 
	protected void generateBinaryOperation (char anOperator) 
	{
		int left, right, result;
		Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		}while(!checkingCalculation(result));
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		value = result;
	 }
	
	abstract boolean checkingCalculation(int anInteger);//根据不同加减法检验结果
	abstract int calculate(int left,int right);//根据不同加减法计算结果
	public boolean equals (BinaryOperation2 anOperation){//判断算式是否存在
		return left_operand == anOperation.getLeft_operand()&right_operand==anOperation.getRight_operand()&
		operator==anOperation.getOperator();
	}
	public String toString() {//输出算式
		String p=new String();
		p=String.valueOf(left_operand)+operator+String.valueOf(right_operand)+"=";
        return p;
	}
	public String fullString() {//输出算式+结果
		String p=new String();
		p=String.valueOf(left_operand)+operator+String.valueOf(right_operand)+"="
				+String.valueOf(value);//可以类内部直接bop.left_operand;但是其他类不能使用
        return p;
	}
	public int getLeft_operand() {
		return left_operand;
	}
	public int getRight_operand() {
		return right_operand;
	}
	public char getOperator() {
		return operator;
	}
	public int getValue() {
		return value;
	}
}