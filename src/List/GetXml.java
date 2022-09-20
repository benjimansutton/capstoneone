package List;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class GetXml {

    public static List<User> getUsers() {
        List<User> userList = new LinkedList<>();
        try {
            // The File path to the XML file.
            Path filePath = Paths.get("/Users/benjimansutton/Documents/Dev/Capstone/NEW/capstone/src/dataset.xml");
            File file = new File(String.valueOf(filePath.toAbsolutePath()));

            // This if statement has the Document Builder and NodeList inside it

            if (file.exists()) {
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(String.valueOf(filePath.toAbsolutePath()));
                // Reads the XML tagName of name & number
                NodeList[] user = { document.getElementsByTagName("name"), document.getElementsByTagName("number") };

                for (int i = 0; i < user[0].getLength(); i++) {

                    String name = user[0].item(i).getTextContent();
                    int number = Integer.parseInt(user[1].item(i).getTextContent());
                    User newUser = new User(name, number);
                    userList.add(newUser);
                }
            } else {
                System.out.println("File not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Returns the userList with data from the XML file.
        return userList;

    }

}
