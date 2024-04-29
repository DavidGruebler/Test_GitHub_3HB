package stringBuilder;

public class HTML {
	
	public static String htmlElement(String tag, String body) {
        if (tag == null || tag.isEmpty()) {
            return body;
        } else if(body == null){
            body = "";
        } return "<" + tag + ">" + body + "</" + tag + ">";
    }
	
	public static String strong(String str) {
        return htmlElement("strong", str);
    }
	
	public static String emphasized(String str) {
        return htmlElement("em", str);
    }
        	
	public static void main(String[] args) {
		System.out.println(htmlElement("strong", "strong is hold"));
		System.out.println(htmlElement("span",null));
	}

}
