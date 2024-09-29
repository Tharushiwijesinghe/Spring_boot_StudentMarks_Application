package com.example.studentform.Controller;

import com.example.studentform.Model.Student;
import com.example.studentform.Repository.studentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    private studentRepository studentRepository;

    @PostMapping("/insert")
    public String saveStudent(
            @RequestParam String studentId,
            @RequestParam String studentName,
            @RequestParam int caMarks,
            @RequestParam int practicalMarks,
            @RequestParam int theoryMarks,
            @RequestParam double finalMarks)
    {
        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName(studentName);
        student.setCaMarks(caMarks);
        student.setPracticalMarks(practicalMarks);
        student.setTheoryMarks(theoryMarks);
        studentRepository.save(student);
        return "redirect:/view;";
    }

    @GetMapping("/view")
    public String viewMarks(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "viewMarks";
    }

    @GetMapping("/")
    public String index(Model model) {
        return "redirect:/insert";
    }

    @GetMapping("/insert")
    public String insertMarsPage() {
      return "insertMarks";
    }
}


