package com.example.courseapiii.Topiccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class topicService {


    @Autowired
    private topicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public void postTopic(Topic topic) {
        topicRepository.save(topic);
        //    topics.add(topic);
    }

    public Topic getid(String id) {
        return topicRepository.findById(id).orElse(null);

    }

    public void deleteTopic(String id) {
        //topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }

    public void updateTopic(String id, Topic topic) {
        //  for (int i = 0; i < topics.size(); i++) {
        //    course t = topics.get(i);
        //  if (t.getId().equals(id)) {
        //    topics.set(i, topic);
        //  return;
        topicRepository.save(topic);

    }
}