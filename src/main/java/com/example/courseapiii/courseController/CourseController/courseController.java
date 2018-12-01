package com.example.courseapiii.courseController.CourseController;

import com.example.courseapiii.Topiccontroller.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {
    @Autowired
    private courseService courseService;
    @RequestMapping(method = RequestMethod.GET,value = "/topic/{id}/course")
    public List<course>getcourses(String TopicId){
        return courseService.getcourses(TopicId);
    }

    @RequestMapping (method = RequestMethod.POST,value = "/topic/{topicId}/course/{id}")
    public void postCourse(@RequestBody course course,@PathVariable String TopicId){
        course.setTopic(new Topic(TopicId, "",""));
        courseService.postcourse(course);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/topic/{topicId}/course")
    public course getId(@PathVariable String id){
        return courseService.getid(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{topicId}/course/{id}")
    public void deleteTopic(@PathVariable String id){
        courseService.deletecourse(id);

    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{topicId}/course/{id}")
    public void updateTopic(@RequestBody course course,@PathVariable String TopicId, @PathVariable String id){
        course.setTopic(new Topic(TopicId,"",""));
        courseService.updatecourse(id, course);
    }
}
