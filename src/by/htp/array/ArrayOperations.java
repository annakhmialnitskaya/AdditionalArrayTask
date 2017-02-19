package by.htp.array;

import java.util.Scanner;

public class ArrayOperations {

	private static int[] array = new int[0];;

	public static int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public static void createArray() {
		Scanner sc = new Scanner(System.in);
		String s;
		while (true) {
			System.out.println("������� � �������� �������� ������� ����� ��� 'q' ��� ���������� �����:");
			s = sc.nextLine();
			if (s.equals("q")) {
				break;
			}
			if (CheckInput.check(s)) {
				int a = Integer.parseInt(s);
				ArrayOperations.addElement(a);
			} else {
				System.out.println("�������� �������� �� �������� ������!");
			}
		}
		System.out.println("������ �����������:");
		printArray(array);
	}

	public static void addElement(int x) {
		int[] newArray = new int[array.length + 1];
		// array - �������� ������
		// 0 - ��������� ������� ��������� �������
		// newArray - ����� ������
		// 0 - ��������� ������� ������ �������
		// array.length - ���������� ��������� ������� ����� ����������� � �����
		// ������
		System.arraycopy(array, 0, newArray, 0, array.length);
		newArray[array.length] = x;
		array = newArray;
	}

	public static void printArray(int[] localArray) {
		System.out.println("������: ");
		for (int i = 0; i < localArray.length; i++) {
			System.out.print(localArray[i] + " ");
		}
		System.out.println();
	}

	public static void maxElement(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("max value=" + maxValue);
	}

	public static void minElement(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("min value=" + minValue);
	}
}
