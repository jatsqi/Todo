package com.jatsqi.todo.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jatsqi.todo.R

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: TodoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = findViewById<RecyclerView>(R.id.todo_list)
        val addButton = findViewById<Button>(R.id.todo_add)
        val inputText = findViewById<TextView>(R.id.todo_input)
    }
}