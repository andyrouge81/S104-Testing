package level1.exercise3;

public class ArrayException {
	public static String exceptionLaunch(int index){
		String[] list = new String[2];
		String indexOut = list[index];
		return indexOut;
	}
}
