package collection.role_list;

import java.util.LinkedList;
import java.util.List;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.relation.Role;

public class RoleListMain {

	public static void main(String[] args) throws MalformedObjectNameException {

		 RoleListImpl roleList = new RoleListImpl();
	        List<ObjectName> rolelist1 = new LinkedList<ObjectName>();
	        rolelist1.add(new ObjectName("domain1","key1","value1"));
	        rolelist1.add(new ObjectName("domain2","key2","value2"));
	        roleList.add(0, new Role("rolename1", rolelist1));
	 
	        List<ObjectName> roleList2 = new LinkedList<ObjectName>();
	        roleList2.add(new ObjectName("domain3","key3","value3"));
	        roleList2.add(new ObjectName("domain4","key4","value4"));
	        roleList.add(1, new Role("rolename2", roleList2));
	 
	        List<Role> list = roleList.asList();
	        //list.add(new ObjectName("domain5", "key5", "value5")); --> 에러 발생
	        //new ArrayList<String>(); new LinkedList<String>();대신 asList();로 List를 생성 하게되면 원소를 새로 추가하거나 삭제 할수 없다.

	        int index = 0;
	        while (index < list.size())
	        {
	            System.out.println(list.get(index++) + "\t");
	            System.out.println();
	        }
	        System.out.println();
	}

}
