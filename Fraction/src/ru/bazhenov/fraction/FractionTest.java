package ru.bazhenov.fraction;


import java.io.IOException;

public class FractionTest {

	public static void main(String[] args) throws IOException {
		Fraction firstFraction = new Fraction();
		Fraction secondFraction = new Fraction();
		firstFraction.ScanFraction();
		secondFraction.ScanFraction();
		//������������ ������� �������������� ��������
		firstFraction.Add(secondFraction).Print();
		firstFraction.Sub(secondFraction).Print();
		firstFraction.Mul(secondFraction).Print();
		firstFraction.Div(secondFraction).Print();
		System.out.println();
		//������������ ���������� � ���������� ���� � � ��������������� �����
		firstFraction.Mixed();
		secondFraction.Mixed();
		System.out.println(Fractions.ConvertToFloat(firstFraction));
		//������������ ������ � ���������
		Fraction[] array = Fractions.ScanMass();
		Fractions.PrintMass(array);
		Fractions.ArraySort(array);
		Fractions.PrintMass(array);
	}
}
