package setinterface;

import java.util.EnumSet;

public class JavaEnum {

	enum color{
		RED, YELLOW, GREEN
	}
	public static void main(String[] args) {
		EnumSet<color> eset = EnumSet.allOf(color.class);

	}

}
