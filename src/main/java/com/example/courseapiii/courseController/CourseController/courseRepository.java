package com.example.courseapiii.courseController.CourseController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface courseRepository extends CrudRepository<course,String > {
    public List<course>findByTopicId(String TopicId);

}
