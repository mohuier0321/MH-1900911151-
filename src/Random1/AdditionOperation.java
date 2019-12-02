package Random1; 
class AdditionOperation extends BinaryOperation2{
	AdditionOperation() {
		generateBinaryOperation('+');
	}
	public boolean checkingCalculation(int anInteger) {
		return anInteger <= UPPER;
	}
	int calculate(int left, int right) {
		return left+right;
	}
	
}