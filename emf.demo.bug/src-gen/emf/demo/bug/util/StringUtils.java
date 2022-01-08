package emf.demo.bug.util;

public class StringUtils {

	/**
	 * Indique quand une chaîne est vide : null, espace, ou 0 length.
	 * 
	 * @param pStr
	 * @return false si non vide.
	 */
	public static boolean isBlank(final String pStr) {
		return pStr == null || pStr.length() == 0 || pStr.matches("^[\\s]*$");
	}
	
}
