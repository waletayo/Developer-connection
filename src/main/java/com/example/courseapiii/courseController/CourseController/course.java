package com.example.courseapiii.courseController.CourseController;

import com.example.courseapiii.Topiccontroller.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity


public class course {
    @ManyToOne
    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Id
    private Topic topic;
    private String id;
    private String description;
    private String name;


    public course() {

    }

    public course(String id, String description, String name,String TopicId) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.topic=new Topic(TopicId ,"" ,"");

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
