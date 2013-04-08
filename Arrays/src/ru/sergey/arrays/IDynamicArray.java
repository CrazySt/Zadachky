package ru.sergey.arrays;

public interface IDynamicArray {
	int size();// � ���������� ������ �������;
	boolean isEmpty();// � ������ �� ������ ��� ���?;
	boolean contains(Object o);// � ���������� �� � ������� ������ o;
	Object[] toArray();// � ���������� � �������� �������;
	boolean add(Object e);// � ���������� ������� � �����, ����������, ������� �� ������ ��������;
	boolean remove(Object o);// � �������� �������, ����������, ��� �� ����� ������ ��� ��� � �������;
	Object remove(int index);// � �������� �� �������, ���������� ��������� ������;
	void clear();// � ������� ���� ������ (������� ��� ��������);
	Object get(int index);// � ���������� ������� �� �������;
	Object set(int index, Object element);// � ������������� ������ �� ����� � �������� index, ���������� �������, ������� ������ ��� �� ���� �����;
	int indexOf(Object o);// � ������ ������� o � ������ �������, ���� �� � ��� ����������, ����� ���������� -1.
}
