package qsp;

import java.io.IOException;

public class Executing_GenericLib {

	public static void main(String[] args) throws IOException {
		String UnandPwd = GenericLibForPropertyfile.getPropertyNotepadData("username","Password");
		System.out.println(UnandPwd);
		

	}

}
