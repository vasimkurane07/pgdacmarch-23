package org.main.in;

class Program {

	static float sumOfSeries(int i, int n, float s) {
		if (i > n)
			return s;
		else {

			if (i % 2 == 0)
				s -= (float) 1 / i;

			else
				s += (float) 1 / i;

			return sumOfSeries(i + 1, n, s);
		}
	}

	public static void main(String[] args) {
		float sum = sumOfSeries(1, 3, 0);

		System.out.printf("%f", sum);
	}
}
