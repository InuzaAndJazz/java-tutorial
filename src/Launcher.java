public class Launcher {

	public static void main(String args[]) {

		String a[] = new String[10];

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				a[i] = "El número " + i + " es par";
			} else {
				a[i] = "El número " + i + " es impar";
			}
			System.out.println(a[i]);
		}

	}

}
