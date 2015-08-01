package collection.role_unresolved_list;

import java.util.LinkedList;
import java.util.List;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.relation.RoleUnresolved;

public class RoleUnresolvedListMain {

	public static void main(String[] args) throws MalformedObjectNameException {

		RoleUnresolvedListImpl roleUnresolvedList = new RoleUnresolvedListImpl();
        List<ObjectName> rolelist1 = new LinkedList<ObjectName>();
        rolelist1.add(new ObjectName("domain1", "key1", "value1"));
        rolelist1.add(new ObjectName("domain2", "key2", "value2"));
        roleUnresolvedList.add(0, new RoleUnresolved("rolename1", rolelist1, 1));
 
        List<ObjectName> roleList2 = new LinkedList<ObjectName>();
        roleList2.add(new ObjectName("domain3", "key3", "value3"));
        roleList2.add(new ObjectName("domain4", "key4", "value4"));
        roleUnresolvedList.add(1, new RoleUnresolved("rolename2", roleList2, 2));
 
        List<RoleUnresolved> list = roleUnresolvedList.asList();
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index++) + "\t");
        }
        System.out.println();
	}

}
