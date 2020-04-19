package com.zhang.controller;

import com.mchange.v1.util.ArrayUtils;
import com.zhang.pojo.Books;
import com.zhang.service.BookService;
import org.apache.ibatis.reflection.ArrayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookeServiceImpl")
    private BookService bookService;

    //查询全部数据返回到展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> bookelist = bookService.queryAllBook();
        model.addAttribute("list",bookelist);
        System.out.println(ArrayUtil.toString(bookelist));
        return "allBook";
    }

    //跳转到添加书籍
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    //添加书籍功能
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updatePage";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("修改书籍+"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        System.out.println("删除书籍+"+id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //根据名称查询名称,只能查出单条数据
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        //List<Map<String, Object>> list = bookService.queryBookByName(queryBookName);
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }
}
