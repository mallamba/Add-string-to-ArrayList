import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;


/**
 * If list does not contain a name, then add the name in alphabetical order
 * @author Louay Khalil
 *
 */
public class AddToListAndSort {
    /**
     * Return false if the list contains the name
     * Else find the alphabetical-correct place to add the name
     * Else add the name at the end of the list
     * @param list
     * @param name
     */
    public boolean addToList(@NotNull ArrayList<String> list, String name){
        if(list.contains((String) name) )
            return false;
        else {
            for (String s : list) {
                if(s.compareToIgnoreCase(name) == 1) {
                    list.add(list.indexOf((String) s), name);
                    return true;
                }
            }
            list.add(name);
            return true;
        }
    }
}