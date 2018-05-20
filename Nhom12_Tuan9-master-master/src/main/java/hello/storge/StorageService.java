package hello.storge;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
	
	//Ta sẽ xây dựng một interface có tên StorageService.
	//Lớp này sẽ phụ trách các xử lý business logic trong ứng dụng.
	//Chứa các phương thức sẽ sử dụng trong MainController

    void init();

    File store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}
