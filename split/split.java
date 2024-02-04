public class split {
	public static void main(String args[]){
		String str = args[0].trim();
		String strs[] = new String[str.length()];
		int	i = 0;
		int	j = 0;
		while (i < str.length())
		{
			strs[j] = "";
			while (i < str.length() && !Character.isWhitespace(str.charAt(i)))
			{
				strs[j] += str.charAt(i);
				i++;
			}
			i++;
			j++;
		}
		for (String word : strs) {
            if (word != null && !word.isEmpty()) {
                System.out.println(word);
            }
        }
	}
}
