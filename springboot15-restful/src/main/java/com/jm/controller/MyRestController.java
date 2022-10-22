package com.jm.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
    /**
     * 查找资源
     * @param studentId
     * @return
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId){
        return "查询到的学生id为"+studentId;
    }

    /**
     * 创建资源
     * @param name
     * @param age
     * @return
     */
    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                          @PathVariable("age") Integer age){
        return "创建学生:name="+name+"#age="+age;
    }

    /**
     * 更新资源
     * @param name
     * @param age
     * @return
     */
    @PutMapping("/student/{name}/{age}")
    public String updateStudent(@PathVariable String name,
                                @PathVariable Integer age){
        return "更新学生:name="+name+"#age="+age;
    }

    /**
     * 删除资源
     * @param id
     * @return
     */
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return "删除学生:id="+id;
    }
}
