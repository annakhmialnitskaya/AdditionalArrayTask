package by.htp.runner;

import by.htp.array.ArrayOperations;

public class Runner {

	public static void main(String[] args) {
		ArrayOperations.createArray();
		ArrayOperations.maxElement(ArrayOperations.getArray());
		ArrayOperations.minElement(ArrayOperations.getArray());
	}

}
