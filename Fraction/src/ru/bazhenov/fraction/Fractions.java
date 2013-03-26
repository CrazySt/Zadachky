package ru.bazhenov.fraction;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Fractions {
	public static float ConvertToFloat(Fraction fraction){
		float result;
		result=((float)fraction.getNumerator())/((float)fraction.getDenominator());
		return result;
	}
	public static void ArraySort(Fraction[] a){
		Arrays.sort(a);
	}
	
	//�� ������������ ����� ����� n ����� ��������� ������� � 2n ����� - ���������� � ������������
	public static Fraction[] ScanMass() throws IOException{
		System.out.println("������� ����� ��������� � ������� ������ ��� ����������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Fraction[] arrayFraction = new Fraction[number];
		for (int i=0; i<number; i++){
			arrayFraction[i]= new Fraction();
			arrayFraction[i].ScanFraction();
		}
		return arrayFraction;
	}
	
	//����� � ������� ��������� �������
	public static void PrintMass(Fraction[] array){
		for(int i=0; i<array.length; i++){
			array[i].Print();
		}
		System.out.println();
	}
}
