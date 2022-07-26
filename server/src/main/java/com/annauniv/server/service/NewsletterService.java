//package com.annauniv.server.service;
//
//import com.annauniv.server.repository.NewsletterMongoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.sql.Timestamp;
//import java.time.Instant;
//
//@Service
//public class NewsletterService {
//
//    @Autowired
//    MongoOperations mongoOperations;
//    @Autowired
//    MongoTemplate mongoTemplate;
//
//    Timestamp instant= Timestamp.from(Instant.now());
//    @Autowired
//    private final NewsletterMongoRepository newsletterMongoRepository;
//
//    @Autowired
//    public NewsletterService(NewsletterMongoRepository newsletterMongoRepository) {
//        this.newsletterMongoRepository = newsletterMongoRepository;
//    }
//
//    public String fetchData(String uri) {
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri, String.class);
//        return result;
//    }
//
//    /*public List<BigInteger> getListofAllUniqueParticipants(Long discussionID){
//        DistinctIterable<DiscussionText> val = mongoTemplate.getCollection("DiscussionText").distinct("userID", DiscussionText.class);
//        System.out.println(val);
//        Set<BigInteger> result = new HashSet<>();
//        List<BigInteger> res = new ArrayList<>();
//        for(DiscussionText vals : val){
//            result.add(vals.getUserID());
//        }
//        System.out.println(result);
//        return res;
//    }
//
//    public void insertIntoDiscussionText(DiscussionText discussionText){
//        mongoOperations.insert(discussionText);
//    }
//
//    public List<DiscussionText> getUserDiscussionText(Long disscussionID) {
//        Criteria criteria = new Criteria();
//        criteria = criteria.and("discussionID").is(disscussionID);
//        Query qry = new Query(criteria);
//
//        List<DiscussionText> res = mongoOperations.find(qry,DiscussionText.class);
//        System.out.println(res);
//        return res;
//    }
//
//    public List<DiscussionText> getAllDiscussionText(){
//
//        List<DiscussionText> res = mongoOperations.findAll(DiscussionText.class);
//
//        return res;
//    }
//
//    public void insertDiscussion(Long id,Long discussionId, String discussionName, String text, UserAccountDesignation accessClass){
//        DiscussionIndex vals = new DiscussionIndex(id,discussionId,discussionName,text,instant,accessClass);
//        discussionIndexJpaRepository.save(vals);
//    }*/
//}
