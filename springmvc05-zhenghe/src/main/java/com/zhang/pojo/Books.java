package com.zhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
public class Books {
    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
