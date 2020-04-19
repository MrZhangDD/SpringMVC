import com.zhang.pojo.Books;
import com.zhang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    @Test
    public void tset1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("BookeServiceImpl");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
