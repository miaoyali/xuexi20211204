package com.example.demo3.shuju;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@ApiModel
public class EmpClass {
    @ApiModelProperty(value = "员工姓名", example = "zhangsan",required = true)
   private String name;
   private int age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Timestamp birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getBirth() {
        return birth;
    }

    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "EmpClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
