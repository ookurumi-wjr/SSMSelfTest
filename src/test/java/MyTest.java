import com.wjr.dao.BookMapper;
import com.wjr.pojo.Books;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookMapper bookMapper = (BookMapper) context.getBean("bookMapper");
        List<Books> allBooks = bookMapper.getAllBooks();
        for (Books book :
                allBooks) {
            System.out.println(book);
        }
    }
}
