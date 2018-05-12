package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("Spring","Spring Framework", "Spring Description"),
			new Topic("Java","Core Java", "Core Java Description"),
			new Topic("Angular","Angular Framework", "Angular Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
