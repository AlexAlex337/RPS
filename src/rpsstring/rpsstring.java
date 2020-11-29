package rpsstring;

/**
 * Класс для работы со строками
 * @autor Алексей Боган
 * @version 1.0
 */
public class rpsstring {
	/**
	 * Метод для получения ответа является ли подстрока префиксом строки. 
	 * @param str Строка в которой будут искать подстроку.
	 * @param sub Подстрока, которую будут определять.
	 * @return true если является префиксом, иначе false.
	 */
	public static boolean isPrefix(String str, String sub) {
		boolean res = false;
		if ((str.length() == 0) || (sub.length() == 0) || (str.length() < sub.length()))
			res = false;
		else {
		for (int i = 0; i < sub.length(); i++) {
			if (sub.charAt(i) == str.charAt(i)) {
				res = true;
			} 
			else {
				res = false;
			}
		}}
		return res;
	}	
	
	/**
	 * Метод для получения ответа является ли подстрока суффиксом строки.
	 * @param str Строка, в которой будут искать подстроку.
	 * @param sub Подстрока, которую будут определять.
	 * @return true если является суффиксом, иначе false.
	 */
	public static boolean isSuffix(String str, String sub) {
		boolean res = false;
		if ((str.length() == 0) || (sub.length() == 0) || (str.length() < sub.length()))
			res = false;
		else {
		int j = 0;
		for (int i = str.length() - sub.length(); i < str.length(); i++) {
			if (str.charAt(i) == sub.charAt(j)) {
				j++;
				res = true;
			}
			else
				res = false;		
		}
		}
		return res;
	}
	
	/**
	 * Метод для получения ответа является ли строка подстрокой строки. 
	 * @param str Строка, в которой будут искать подстроку.
	 * @param sub Подстрока, которую будут определять.
	 * @return true если является подстрокой, иначе false.
	 */
	public static boolean isSubstring(String str, String sub) {
			boolean res = false;
			if ((str.length() == 0) || (sub.length() == 0) || (str.length() < sub.length()))
				res = false;
			else {
			for (int i = 0; i <= str.length() - sub.length(); i++) {
				int j = 0;
				while ((j < sub.length()) && (str.charAt(i + j) == sub.charAt(j))) {
					j++;
				}
				if (j == sub.length()) {
					res = true;
				}
			}}
				return res;
		}

	/**
	 * Метод для получения ответа является ли строка подпоследовательностью строки
	 * @param str Строка в которой будут искать подпоследовательность
	 * @param sub Подстрока которую будут определять
	 * @param m   Длина строки
	 * @param n   Длина подстроки
	 * @return true если является подпоследовательностью, иначе false.
	 */
	public static boolean isSubsequence(String sub, String str, int m, int n) {
		if (str.length() < sub.length())
			return false;
		if (m == 0)
			return true;
			if (n == 0)
			return false;
			// If last characters of two strings are matching
			if (sub.charAt(m-1) == str.charAt(n-1))
			return isSubsequence(sub, str, m-1, n-1);
			// If last characters are not matching
			return isSubsequence(sub, str, m, n-1);	
	}
	
}
