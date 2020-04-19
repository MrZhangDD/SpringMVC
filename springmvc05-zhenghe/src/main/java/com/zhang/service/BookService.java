package com.zhang.service;

import com.zhang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookService {

    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(int id);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(int id);
    List<Books> queryAllBook();
    //List<Map<String,Object>> queryBookByName(String bookName);
   Books queryBookByName(String bookName);
}
