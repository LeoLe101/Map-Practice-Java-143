package le;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Phuc Hong Le
 */
public class MapPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sid = {958013597, 986023467, 967035467, 968056798};
        String[] name = {"Kim", "Leo", "Matt", "Xayah"};
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        for (int i = 0; i < sid.length; i++) {
            hm.put(sid[i], name[i]);
            lhm.put(sid[i], name[i]);
            tm.put(sid[i], name[i]);
        }
        //Map.Entry is for the set of pair that will not have duplicate value
        Set<Map.Entry<Integer, String>> pairs = hm.entrySet();
        //Iterator will iterating over these pairs by 
        //declaring the data type in side the iterator
        Iterator<Map.Entry<Integer, String>> itr = pairs.iterator(); //if don't do this way, u will have to cast it to iterator or something...
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        //print LinkedHashMap
        pairs = lhm.entrySet(); 
        itr = pairs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        //print TreeMap
        pairs = tm.entrySet();
        itr = pairs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
