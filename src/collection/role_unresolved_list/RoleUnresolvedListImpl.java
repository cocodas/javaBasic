package collection.role_unresolved_list;

import java.util.Collection;
import java.util.List;

import javax.management.relation.RoleUnresolved;
import javax.management.relation.RoleUnresolvedList;

public class RoleUnresolvedListImpl {
	
	private RoleUnresolvedList roleUnresolvedList;
	 
    public RoleUnresolvedListImpl()
    {
        roleUnresolvedList = new RoleUnresolvedList();
    }
 
    public RoleUnresolvedListImpl(int initialCapacity)
    {
        roleUnresolvedList = new RoleUnresolvedList(initialCapacity);
    }
 
    public RoleUnresolvedListImpl(List<RoleUnresolved> list)
    {
        roleUnresolvedList = new RoleUnresolvedList(list);
    }
 
    public void add(int index, Object element)
    {
        roleUnresolvedList.add(index, element);
    }

    public void add(int index, RoleUnresolved role)
    {
        roleUnresolvedList.add(index, role);
    }
 
    public boolean add(Object o)
    {
        return roleUnresolvedList.add(o);
    }
 
    public void add(RoleUnresolved role)
    {
        roleUnresolvedList.add(role);
    }
 
    public boolean addAll(Collection<?> c)
    {
        return roleUnresolvedList.addAll(c);
    }
 
    public boolean addAll(int index, Collection<?> c)
    {
        return roleUnresolvedList.addAll(index, c);
    }
 
    public boolean addAll(int index, RoleUnresolvedList roleList)
    {
        return this.roleUnresolvedList.addAll(index, roleList);
    }
 
    public boolean addAll(RoleUnresolvedList roleList)
    {
        return roleList.addAll(roleList);
    }
 
    public List<RoleUnresolved> asList()
    {
        return roleUnresolvedList.asList();
    }
 
    public Object set(int index, Object element)
    {
        return roleUnresolvedList.set(index, element);
    }
 
    public void set(int index, RoleUnresolved role)
    {
        roleUnresolvedList.set(index, role);
    }

}
