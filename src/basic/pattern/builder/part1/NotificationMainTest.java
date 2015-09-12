package basic.pattern.builder.part1;

public class NotificationMainTest {
	public static void main(String[] args) {
		Notification notification = new Notification.Builder(10, 20, "builder").setBuilderC(30).setBuilderE("pattern").setBuilderF("OK!!").build();
		System.out.println(notification);
	}

}
