package collection.role_list;

import java.util.Collection;
import java.util.List;

import javax.management.relation.Role;
import javax.management.relation.RoleList;

public class RoleListImpl {
	private RoleList roleList;

	public RoleListImpl() {
		roleList = new RoleList();
	}

	public RoleListImpl(int initialCapacity) {
		roleList = new RoleList(initialCapacity);
	}

	public RoleListImpl(List<Role> list) {
		roleList = new RoleList(list);
	}

	public void add(int index, Object element) {
		roleList.add(index, element);
	}

	public void add(int index, Role role) {
		roleList.add(index, role);
	}

	public boolean add(Object o) {
		return roleList.add(o);
	}

	public void add(Role role) {
		roleList.add(role);
	}

	public boolean addAll(Collection<?> c) {
		return roleList.addAll(c);
	}

	public boolean addAll(int index, Collection<?> c) {
		return roleList.addAll(index, c);
	}

	public boolean addAll(int index, RoleList roleList) {
		return this.roleList.addAll(index, roleList);
	}

	public boolean addAll(RoleList roleList) {
		return roleList.addAll(roleList);
	}

	public List<Role> asList() {
		return roleList.asList();
	}

	public Object set(int index, Object element) {
		return roleList.set(index, element);
	}

	public void set(int index, Role role) {
		roleList.set(index, role);
	}
}
