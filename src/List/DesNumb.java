package List;

import java.util.LinkedList;
import java.util.List;

import static List.GetXml.getUsers;

public class DesNumb {
    // This function gets the information from the Linked List and then displays it in Descending Order by the Number
    public static List<User> getDesNumb() {
        List<User> desList = new LinkedList<User>();
        desList.addAll(getUsers());
        desList.sort((u1, u2) -> u2.getNumber() - u1.getNumber());

        return desList;
    }
}
