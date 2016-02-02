package ocp.filesio;

import java.io.File;

public class TestIOFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            File dir = new File("dir3");
            dir.mkdir();
            File file = new File(dir, "file3");
            file.createNewFile();
		} catch (Exception x) { } 
	}

}
