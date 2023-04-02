package com.pract1.tests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pract1.tests.models.Answer;
import com.pract1.tests.models.Schedule;
import com.pract1.tests.models.StudentAnswer;
import com.pract1.tests.models.TestList;
import com.pract1.tests.models.User;
import com.pract1.tests.repository.AnswerRepository;
import com.pract1.tests.repository.ScheduleRepository;
import com.pract1.tests.repository.StudAnswRepository;
import com.pract1.tests.repository.TestListRepository;
import com.pract1.tests.repository.UserRepository;
import com.pract1.tests.schemas.ResultsByStudents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TestListRepository testListRepository;
    @Autowired
    AnswerRepository answerRepository;
    @Autowired
    StudAnswRepository studAnswRepository;
    @Autowired
    ScheduleRepository scheduleRepository;

    @GetMapping("/list")
    public List<TestList> allTests() {
        return testListRepository.findAll();
    }

    @GetMapping("/next/{student_id}")
    public List<TestList> getTestsListByStudent(@PathVariable Integer student_id) {
        User user = userRepository.findById(student_id).get();
        List<Schedule> schedules = scheduleRepository.findAllByGroupId(user.getGroupId());
        List<TestList> tests = new ArrayList<>();
        for (Schedule sc : schedules) {
            TestList t = testListRepository.findById(sc.getTestId()).get();
            tests.add(t);
        }
        return tests;
    }
    @GetMapping("/results")
    public List<ResultsByStudents> getResultsForStudents() {
        List<ResultsByStudents> results = new ArrayList<>();
        List<User> students = userRepository.findUsersByRoleId(1);
        for (User u : students) {
            ResultsByStudents temp = new ResultsByStudents();
            temp.student = u;
            temp.BallsByTest = new HashMap<>();
            List<StudentAnswer> answers = studAnswRepository.findAllByUserId(u.getRowId());
            for (StudentAnswer ans : answers) {
                TestList t = testListRepository.findTestListByRowId(ans.getTestId());
                Answer a = answerRepository.findAnswerByRowId(ans.getAnswerId());
                if (!temp.BallsByTest.containsKey(t)) {
                    temp.BallsByTest.put(t, 0);
                }
                if (a.getCorrect()) {
                    temp.BallsByTest.put(t, temp.BallsByTest.get(t) + 1);
                }
            }
            results.add(temp);
        }
        return results;
    }
}
