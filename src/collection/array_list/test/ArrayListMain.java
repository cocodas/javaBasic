package collection.array_list.test;

public class ArrayListMain {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		AddStorage<Membership> add = new AddStorage<Membership>();
		@SuppressWarnings("rawtypes")
		RemoveStorage<Membership> remove = new RemoveStorage<>();
		
		add.execute(new Membership.MembershipBuilder().name("심성규").id("rolendSunQ").passWD("1234").regitationNumber(740512).birMonth(07).birthDay(22).mailAddress("rolendSunQ@hanmail.net").builder());
		add.execute(new Membership.MembershipBuilder().name("이태근").id("cocodas").passWD("7890").regitationNumber(83041510444820L).birMonth(04).birthDay(15).mailAddress("cocodas1@naver.com").builder());
		add.execute(new Membership.MembershipBuilder().name("홍길순").id("gilsoon").passWD("2134").regitationNumber(890211).birMonth(02).birthDay(11).mailAddress("gilsoon89@naver.com").builder());
		add.display();
		
//		Iterator<Membership> itr = add.getArrayListStorage().arrayListStorage.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next() + "\n");
//		}
		//System.out.println(add.getArrayListStorage().arrayListStorage.);
		
		System.out.println("------------------------------------------------------");
		remove.setArrayListStorage(add.getArrayListStorage());
		remove.execute(1);
		
		remove.display();
		
	}

}
