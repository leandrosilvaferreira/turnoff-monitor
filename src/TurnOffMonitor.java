
public class TurnOffMonitor {

	public static void main(final String[] args) {
		try {
			final String os = System.getProperty("os.name");
			if (os.startsWith("Linux")) {
				Runtime.getRuntime().exec("xset dpms force off");
			}
			else if (os.startsWith("Windows")) {
				Runtime.getRuntime().exec("C:\\Windows\\system32\\scrnsave.scr /s");
			}

		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}

}
