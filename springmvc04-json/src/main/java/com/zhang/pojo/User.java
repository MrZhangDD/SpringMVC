package com.zhang.pojo;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.StringHttpMessageConverter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public String name;
    public int id;
    public int age;
}
