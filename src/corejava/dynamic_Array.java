package corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class dynamic_Array{

public static void main(String[] args) {
	
  
ArrayList<Integer>numlist=new ArrayList<Integer>();
numlist.add(21);
numlist.add(22);
numlist.add(56);
numlist.add(15);

Collections.sort(numlist);
System.out.println(numlist);
ArrayList<String>obj=new ArrayList<String>(Collections.nCopies(10, "iphone"));
System.out.println(obj);

int ar[]=new int[] {3,4,5,7,2,1};
Arrays.sort(ar);
System.out.println(numlist.get(0));
numlist.remove(2);
System.out.println(numlist);

ArrayList<String>studentNames=new ArrayList<String>(Arrays.asList("varun","reena","naveen","robin","peter"));
System.out.println(studentNames);
Collections.reverse(studentNames);
System.out.println(studentNames);
studentNames.clear();
System.out.println(studentNames);
ArrayList<Object>ref= new ArrayList<Object>(Arrays.asList("suuppuu",28,'f',1995,"btech"));
System.out.println(ref);
/*for(int i=0;i<ref.size();i++) {
	System.out.println(get(i));
}
	if(ref.get(i)=="btech") {
		System.out.println("list stoped");
		break;
}
	System.out.println("");

}

}
*/
}
}