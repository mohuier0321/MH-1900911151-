package Random;
public class SubstractOperation extends BinaryOperation2{
	SubstractOperation() {
		 super();
			generateBinaryOperation('-');
		}
		boolean checkingCalculation(int anInteger) {
			return anInteger >= LOWER;
		}
		int calculate(int left, int right) {
			return left-right;
		}
		
}