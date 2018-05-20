package hello.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import hello.dao.PostRepository;
import hello.model.Post;

@Service
@Transactional
public class PostService {
	private final PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public List<Post> findAll(){
		List<Post> listPost = new ArrayList<Post>();
		for(Post post : postRepository.findAll()){
			listPost.add(post);
		}
		return listPost;
	}
	
	public Post findPost(int id){
		return postRepository.findOne(id);
	}
	
	public void save(Post post){
		postRepository.save(post);
	}
	
	public void delete(int id){
		postRepository.delete(id);
	}
}
