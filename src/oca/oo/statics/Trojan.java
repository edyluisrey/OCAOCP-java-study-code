package oca.oo.statics;

public class Trojan {
    public static int countCompromised(String xml, String infectedFileId) {
		return 0;
        
    }

    public static void main(String[] args) {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<root>" +
                "   <snapshot>" +
                "      <folder>" +
                "         <file fileId=\"1\"/>" +
                "         <file fileId=\"2\"/>" +
                "         <folder>" +
                "            <file fileId=\"3\"/>" +
                "            <file fileId=\"4\"/>" +
                "         </folder>" +
                "      </folder>" +
                "   </snapshot>" +
                "   <snapshot>" +
                "      <file fileId=\"1\"/>" +
                "      <file fileId=\"3\"/>" +
                "      <folder>" +
                "         <file fileId=\"2\"/>" +
                "         <file fileId=\"4\"/>" +
                "         <folder>" +
                "            <file fileId=\"3\"/>" +
                "            <file fileId=\"4\"/>" +
                "         </folder>" +
                "      </folder>" +
                "   </snapshot>" +
                "</root>";

        System.out.println(Trojan.countCompromised(xml, "3"));
    }
}
