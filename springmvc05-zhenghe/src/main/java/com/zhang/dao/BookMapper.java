package com.zhang.dao;

import com.zhang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookMapper {

    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookId") int id);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(@Param("bookId") int id);
    List<Books> queryAllBook();

    //List<Map<String, Object>> queryBookByName(@Param("bookName") String bookName);
   Books queryBookByName(@Param("bookName") String bookName);

}
