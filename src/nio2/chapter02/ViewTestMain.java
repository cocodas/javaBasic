package nio2.chapter02;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Set;

public class ViewTestMain {

	public static void main(String[] args) {
		/*
		 * view의 속성에 접근하기 전에 현재 파일 시스템이 해당 뷰를 지원하는지 확인해야한다.
		 * 이름으로 지원하는 뷰의 전체 목록 조회와 파일 저장소(partition, divice volume과 
		 * 같은 저장소 타입을 매핑한 FileStore class로 표현한다)가 특정 뷰를 지원하는지 
		 * 검사할 수 있다.
		 * 
		 * 기본 파일 시스템에 대한 접근: FileSystems.getDefault();
		 * 지원 뷰에 대한 속성 보기(이터레이터): FileSystem.supportedFileAttributeViews();
		 */
		FileSystem fs = FileSystems.getDefault();
		Set<String> views = fs.supportedFileAttributeViews();
		
		for (String view : views) {
			System.out.println(view);
		}
	}

}
