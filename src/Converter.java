import java.util.ArrayList;

public class  Converter{

    public static ArrayList<Integer> listConverter(int startindex, ArrayList list){
        if (list.size()/2<=startindex)return null;
        int a = (int) list.get(list.size()-1-startindex);
        list.set(list.size()-1-startindex,list.get(startindex));
        list.set(startindex,a);
        listConverter(++startindex,list);
        return list;
    }
}

