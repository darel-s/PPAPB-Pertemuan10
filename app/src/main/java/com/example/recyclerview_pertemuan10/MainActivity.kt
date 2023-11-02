package com.example.recyclerview_pertemuan10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_pertemuan10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapterStudent = StudentAdapter(generateStudentsData())
        with(binding) {
            rvStudent.apply {
                adapter = adapterStudent
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }
fun generateStudentsData() : List<Student> {
    return listOf(
        Student(name = "Rambu", hobby = "Memancing"),
        Student(name = "Aziz", hobby = "Mbego"),
        Student(name = "Darel", hobby = "Ngopi"),
        Student(name = "Wildan", hobby = "Putus Nyambung"),
        Student(name = "Yodhim", hobby = "Nebeng")
    )
}
}