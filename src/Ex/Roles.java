package Ex;

public class Roles {

	public static void main(String[] args) {
		String[] roles = {
				"Городничий", 
				"Аммос Федорович", 
				"Артемий Филиппович", 
				"Лука Лукич"};
		String[] textLines = {
				"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
				"Аммос Федорович: Как ревизор?",
				"Артемий Филиппович: Как ревизор?",
				"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
				"Аммос Федорович: Вот те на!",
				"Артемий Филиппович: Вот не было заботы, так подай!",
				"Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
		System.out.println(printTextPerRole(roles, textLines));
	}

	public static String printTextPerRole(String[] roles, String[] textLines) {
		StringBuilder print = new StringBuilder();
	    for (int i = 0; i < roles.length; i++) {
	    	print.append(roles[i] + ":\n");
	    	for (int j = 0; j < textLines.length; j++) {
	    		if (textLines[j].startsWith(roles[i] + ":")) {
	    			print.append(textLines[j].replaceFirst(roles[i] + ":", j + 1 + ")") + "\n");
	    		}
	    	}
	    	print.append("\n");
	    }
	    return print.toString();
	}
}

