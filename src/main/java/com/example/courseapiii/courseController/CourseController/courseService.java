package com.example.courseapiii.courseController.CourseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseService {


    @Autowired
    private courseRepository courseRepository;

    public List<course> getcourses(String TopicId) {
       List<course> courses =new ArrayList<>();
       courseRepository.findByTopicId(TopicId)
       .forEach(courses::add);
         return courses;
    }
    public void postcourse(course course){
        courseRepository.save(course);
        //    topics.add(course);
    }
    public course getid(String id){
     return   courseRepository.findById(id).orElse(null);

    }
    public void deletecourse(String id){
        //topics.removeIf(t->t.getId().equals(id));
        courseRepository.deleteById(id);
    }
    public void updatecourse(String id,course course) {
      //  for (int i = 0; i < topics.size(); i++) {
        //    course t = topics.get(i);
          //  if (t.getId().equals(id)) {
            //    topics.set(i, course);
              //  return;
        courseRepository.save(course);

            }
        }