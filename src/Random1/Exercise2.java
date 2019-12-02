package Random1;
import java.util.Random;
public class Exercise2 {
	private static final short OperationNumber = 100;
	private BinaryOperation2 operationList[] = new BinaryOperation2[OperationNumber];
	public void generateBinaryExercise(int operationCount) {
		BinaryOperation2 anOperation;
		//声明两个对象一个用于储存算式，一个用来调用方法
    	for(int i=0; i < operationCount; i++) {//产生 个
    		anOperation = generateOperation2();//产生算式
    		while(contains(anOperation,i-1)) {//判断算式是否已存在   			
    		anOperation = generateOperation2();
    		}
    		operationList[i]=anOperation;//存入对象数组中	
    	}
	}
	private BinaryOperation2 generateOperation2() {
		Random random = new Random();
		int operation;
		operation = random.nextInt(2);
		if(operation==0){
			return new AdditionOperation();
		}else{
			return new SubstractOperation();
		}
	}
	public void generateAdditionExercise(int operationCount) {//产生一定数量的加法算式
		BinaryOperation2 anOperation;
		//声明两个对象一个用于储存算式，一个用来调用方法
    	for(int i=0; i < operationCount; i++) {//产生 个
    		anOperation = new AdditionOperation();//产生算式
    		while(contains(anOperation,i-1)) {//判断算式是否已存在   			
    		anOperation = new AdditionOperation();
    		}
    		operationList[i]=anOperation;//存入对象数组中	
    	}
	}
	public void generateSubstractExercise(int operationCount) {//产生一定数量的减法算式
		BinaryOperation2 anOperation;
		//声明两个对象一个用于储存算式，一个用来调用方法
    	for(int i=0; i < operationCount; i++) {//产生 几个算式
    		anOperation = new SubstractOperation();//产生算式
    		while(contains(anOperation,i-1)) {//判断算式是否已存在   			
    		anOperation = new SubstractOperation();
    		}
    		operationList[i]=anOperation;//存入对象数组中	
    	}
	}
	private boolean contains(BinaryOperation2 anOperation, int length)
	{
		boolean found = false;
		for(int i=0; i<length; i++) 
		{
			if (anOperation.equals(operationList[i]))
			{
				found=true;
				break;
			}
		}
		return found;
	}
	
	public void formattedDisplay (int colimns) {//每行显示一定数量的算式
		System.out.println("-----------------习题----------------");
		for(int i=0;i<100;i++) {
			if(operationList[i]==null)break;
			System.out.print(operationList[i].toString()+" ");
			if((i+1)%colimns==0) {
				System.out.println();
			}
		}
		System.out.println("-----------------答案-----------------");
		for(int i=0;i<100;i++) {
			if(operationList[i]==null)break;
			System.out.print(operationList[i].fullString()+" ");
			if((i+1)%colimns==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args){
    	Exercise2 e=new Exercise2();  	
    	e.generateBinaryExercise(60);//输出60个算式
    	e.formattedDisplay(6);//6个一行
    }
}

