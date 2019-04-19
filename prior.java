package Gotham;
import java.util.*;

public class prior implements Comparator<Edge> {

	@Override
	public int compare(Edge arg0, Edge arg1) {
		// TODO Auto-generated method stub
		if(arg0.weight>arg1.weight)
			return 1;
		if(arg0.weight<arg1.weight)
			return -1;
		return 0;
	}

}
