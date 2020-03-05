package com.nvt.api;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nvt.model.Student;

@RestController
public class TestApi {
	@GetMapping("/api/list-user")
	public ResponseEntity<ArrayList<String>> getUserList(){
		ArrayList<String> result = new ArrayList<String>();
		result.add("hello");
		result.add("world");
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/api/return-list")
	public ResponseEntity<ArrayList<String>> getList(){
		ArrayList<String> result = new ArrayList<String>();
		result.add("hello");
		result.add("world");
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/api/return-object")
	public ResponseEntity<Student> getObject(){
		Student std = new Student(1, "Thanh", 22);
		return ResponseEntity.ok(std);
	}
	
	@GetMapping("/api/return-list-object")
	public ResponseEntity<ArrayList<Student>> getListObject(){
		ArrayList<Student> students = new ArrayList<Student>();
		Student student1 = new Student(1, "Thanh", 22);
		Student student2 = new Student(2, "Trang", 24);
		Student student3 = new Student(3, "Định", 23);
		Student student4 = new Student(4, "Sang", 23);
		Student student5 = new Student(5, "Tuấn", 22);
		Student student6 = new Student(6, "Thắng", 22);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		return ResponseEntity.ok(students);
	}
}
