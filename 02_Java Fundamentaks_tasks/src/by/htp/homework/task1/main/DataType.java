package by.htp.homework.task1.main;

import java.util.Scanner;
import java.util.Math;

public class DataType {

	public static void main(String[] args) {

		task1(); 
					
		task2();
		
		task3();

		task4();
		
		task5();
		
		task6();
		
		task7();
		
		task8();
		
		task9();
		
		task10();
		  
		task11();
		 
 		task12();
		  
		task1314();
		  
		task15();
		 		
	}
	

	public static double inputDouble() {

		Scanner inputPer = new Scanner(System.in);

		while (!inputPer.hasNextDouble()) {
			System.out.println("Введите корректное значение: "); 
			inputPer.next();
		} 
			return inputPer.nextDouble();
		
	}
	
	public static int inputInt () {

		Scanner inputPer = new Scanner(System.in);

		while (!inputPer.hasNextInt()) {
			System.out.println("Введите корректное значение: "); 
			inputPer.next();
		}
		return inputPer.nextInt();
		
	}
	
	public static long inputLong () {

		Scanner inputPer = new Scanner(System.in);

		while (!inputPer.hasNextLong()) {
			System.out.println("Введите корректное значение: "); 
			inputPer.next();
		}
		return inputPer.nextLong();
		
	}

	public static void task1 () {
				
		System.out.println("Задание 1");
		
		double a;
		double b;
		double c;
		
		System.out.print("a= ");
		a = inputDouble();

		System.out.print("b= ");
		b = inputDouble();

		System.out.print("c= ");
		c = inputDouble();
		
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
		double res;
		
		res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a *c)) / (2 * a)- Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Результат: " + res);
	}
	
	public static void task2 () {
		
		System.out.println("Задание 2");
		
		double a;
		double b;
		double c;
		
		System.out.print("a= ");
		a = inputDouble();

		System.out.print("b= ");
		b = inputDouble();

		System.out.print("c= ");
		c = inputDouble();
		
		double res;
		double d;
		
		System.out.print("d= ");
		d = inputDouble();
		
		res = (a / c) * (b / d) - (a * b - c)/(c * d);
		System.out.println("Результат: " + res);
	}
	
	public static void task3 () {
		
		System.out.println("Задание 3");
		int aBite, kBite, mBite, gBite, tBite;
		
		System.out.print("Введите объем в байтах= ");
		aBite = inputInt();
		
		kBite = aBite/1024;
		mBite = kBite/1024;
		gBite = mBite/1024;
		tBite = gBite/1024;
		
		System.out.println("Байт: " + aBite + ", Килобайт: " + kBite + ", Мегабайт: " + mBite + ", Гигабайт: " + gBite + ", Терабайт: " + tBite);
	}
	
	public static void task4 () {
		
		System.out.println("Задание 4");
		
		double a;
		double b;
		
		System.out.print("a= ");
		a = inputDouble();

		System.out.print("b= ");
		b = inputDouble();
		
		if (a < b) {
			System.out.print("7");
		}
		else {
			System.out.println("8");
		}
		
	}
	
	public static void task5 () {
		
		System.out.println("Задание 5");
		
		double a;
		double b;
		
		System.out.print("a= ");
		a = inputDouble();

		System.out.print("b= ");
		b = inputDouble();

		if (a < b) {
			System.out.println("Из чисел " + a + " & " + b + " меньше " + a);
		}
		else if (a > b){
			System.out.println("Из чисел " + a + " & " + b + " меньше " + b);
		}
		else if (a == b){
			System.out.println("Чисела " + a + " & " + b + " равны");
		}
		else {
			System.out.println("Невозможно определить");
		}
		
	}
	
	public static void task6 () {
			
		int a;
		int b;
		
			System.out.println("Задание 6");
			System.out.print("Введите углы в градусах от 0 до 360,\n a: ");
			
			a = inputInt();
			while ((a >= 360) || (a <= 0)) {
				System.out.print("введите угол от 0 до 360 градусов: ");
				a = inputInt();
			}
			
			System.out.print("b: ");
			b = inputInt();
			while ((b >= 360) || (b <= 0)) {
				System.out.print("введите угол от 0 до 360 градусов: ");
				b = inputInt();
			}
			
			if ((a + b) == 90) {
				System.out.println ("Прямоугольный треугольник");
			}
			else if ((a + b) < 180) {
				System.out.println ("НЕпрямоугольный треугольник");
			}
			else {
				System.out.println ("Треугольника не существует");
			}
	}
	
	public static void task7 () {
		
		System.out.println("Задание 7");
		
		double a;
		double b;
		double c;
		
		System.out.print("a= ");
		a = inputDouble();

		System.out.print("b= ");
		b = inputDouble();

		System.out.print("c= ");
		c = inputDouble();
		
		int n = 0;
	
		if (a < 0) {n += 1;}
		if (b < 0) {n += 1;}
		if (c < 0) {n += 1;}
		
		System.out.println("Количество отрицательных чисел: " + n);

	}
	
	public static void task8 () {
		
		System.out.println("Задание 8");
		int x;
		int y;
		int z;
		
		int a = 10;
		int b = 20;
		
		System.out.println("Есть отверстие " + a + " x " + b + " введите размер кирпича:");
		
		System.out.print("x= ");
		x = inputInt();

		System.out.print("y= ");
		y = inputInt();

		System.out.print("z= ");
		z = inputInt();
		
		int min1, min2;
		
		if (x <= y) {min1 = x;}
		else if (x <= z) {min1 = x;}
		else {min1 = z;}
		
		if (y <= z) {min2 = y;}
		else {min2 = z;}
		
		if (min1 <= a && min2 <= b) {System.out.println("кирпич пройдет через отверстие");}
		else if (min2 <= a && min1 <= b) {System.out.println("кирпич пройдет через отверстие");}
		else {System.out.println("кирпич НЕ пройдет через отверстие");}
	}
	
	public static void task9 () {
		
		double x;
		double y;
		double res;
		
		System.out.println("Задание 9");
		
		System.out.print("x= ");
		x = inputDouble();
		
		if (x <= 3) {
			res = Math.pow(x, 2) - 3 * x + 9;
		}
		else {
			res = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println("Результат: " + res);
	}

	public static void task10 () {
		
		int x=2;
		
		System.out.println("Задание 10");
		System.out.print("Четные числа от 2 до 100:");
		
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.print(" " + x);
			}
		++x;
		}
	}

	public static void task11 () {
		int a;
		int b;
		int h;
		
		System.out.println("Задание 11");
		
		System.out.print("Задайте отрезок [a:b] (a,b - целочисленные): a = ");
		a = inputInt();
		
		System.out.print("b = ");
		b = inputInt();
		
		System.out.print("Задайте шаг h (h - целочисленное число): h = ");
		h = inputInt();
		
		int x = 0;
		int y;
		int n;
		
		x = Math.min(a, b);
		n = Math.max(a, b);
		
		System.out.print("\n результат [" + a + ":" + b + "] шаг " + h + ":");
		for (; x <= n; x += h)	{
			if (x > 2) {
				y = x;
			}
			else {
				y = -x;
			}
			
			System.out.print(" " + y);
		}
		
	}

	public static void task12 () {
		int i;
		char asc;
		
		System.out.println("Задание 12");
		System.out.print("ASCII: number  - Char:");
		
		for (i = 0; i <= 255; i++) {
		
			asc = (char)i;
			System.out.println(" " + i + " - " + asc);
		}
	}

	public static void task1314 () {
		long a = 0;
		long i;
		long res = 0;
		
		System.out.println("Задание 13 / 14");
		System.out.print("Введите целое положительное число a: ");
				
		while (a <= 0) {
			a = inputLong();
		}
		
		for (i = 1; i <= a ; i++) {
			res += i;
			if (res >= Long.MAX_VALUE || res < 0) {
				System.out.println("Превышено максимальное допустимое значение для расчета суммы");
				break;
			}
			if (i == a) {
				System.out.println("сумма: " + res);
			}
		}
		
		res = 1;
		
		for (i = 1; i <= a ; i++) {
			res *= i;
			//System.out.println("res " + i + ": " + res);
			if (res >= Long.MAX_VALUE || res < 0) {
				System.out.println("Превышено максимальное допустимое значение для расчета фактериала");
				break;
			}
			if (i == a) {
				System.out.println("факториал: " + res);
			}
		}
		
	}


	public static void task15 () {
		long a = 0;
		long b = 0;
		long res;
		long minPer;
		long maxPer;
		
		System.out.println("Задание 15");
		System.out.print("Введите целое положительное число a: ");
		
		while (a <= 0) {
			a = inputLong();
		}
		
		System.out.print("b: ");
		
		while (b <= 0) {
			b = inputLong();
		}
		
		minPer = Math.min(a, b);
		maxPer = Math.max(a, b);
		
		res = 1;
		for (long i = 1; i <= minPer ; i++) {
			if ((minPer % i == 0) && (maxPer % i == 0)) {
				res = i;
			}
		}
		
		System.out.println("НОД " + a + " & " + b + ": " + res);
	}
	
}
