package com.TODO.Paul.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {
    var todolist: MutableList<ToDo> = mutableListOf()

    @GetMapping("/todos")
    fun getTodos(): List<ToDo> {
        return todolist
    }
    @PostMapping("/todos")
    fun addTodos(@RequestBody inputTodo: ToDo): ToDo {
        todolist.add(inputTodo)
        return inputTodo
    }
}