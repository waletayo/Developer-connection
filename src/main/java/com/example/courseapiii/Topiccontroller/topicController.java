package com.example.courseapiii.Topiccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicController {
    @Autowired
    private topicService topicService;
    @RequestMapping(method = RequestMethod.GET,value = "/topic")
    public List<Topic>getTopics(){
        return topicService.getTopics();
    }

    @RequestMapping (method = RequestMethod.POST,value = "/topic")
    public void postTopic(@RequestBody Topic topic){
        topicService.postTopic(topic);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/topic/{id}")
    public Topic getId(@PathVariable String id){
        return topicService.getid(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);

    }
    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{id}")
    public void updateTopic(@RequestBody  Topic topic,@PathVariable String id){
         topicService.updateTopic(id,topic);
    }
}
