package java.org.example;

import com.forum.api.model.User;
import com.forum.api.records.topic.*;
import com.forum.api.repository.TopicRepository;
import com.forum.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private UserRepository userRepository;

    public TopicResponseData createTopic(CreateTopicData data) {
        var author = userRepository.getReferenceById(data.authorId());
        var topic = new Topic(data, author);
        topicRepository.save(topic);
        return new TopicResponseData(topic);
    }

    public Page<ListTopicData> listTopics(Pageable pagination) {
        return topicRepository.findAll(pagination).map(ListTopicData::new);
    }

    public TopicResponseData getTopic(Long id) {
        var topic = topicRepository.getReferenceById(id);
        return new TopicResponseData(topic);
    }

    public TopicResponseData updateTopic(UpdateTopicData data) {
        var topic = topicRepository.getReferenceById(data.id());
        topic.updateData(data);
        return new TopicResponseData(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}