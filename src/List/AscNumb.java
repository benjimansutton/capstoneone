package List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static List.GetXml.getUsers;

public class AscNumb {
    // This function gets the information from the Linked List and then displays it in Ascending Order by the Number
    public static List<User> getAscNumb() {
        List<User> ascList = new LinkedList<User>();
        ascList.addAll(getUsers());
        ascList.sort(Comparator.comparingInt((User u) -> u.getNumber()));
        return ascList;
    }
}
