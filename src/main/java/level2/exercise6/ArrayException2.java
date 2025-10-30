package level2.exercise6;

public class ArrayException2 {

	public static void outBoundLaunchException(int index) {
		String[] listNames = {"Ramón", "Pedro","Lisa"};
		String outIndex = listNames[index];
		System.out.println(outIndex);
	}

}
