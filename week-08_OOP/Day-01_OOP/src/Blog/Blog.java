package Blog;

import BlogPost.BlogPost;

import java.util.List;

public class Blog {
    List<BlogPost> listOfPosts;

    public Blog() {
    }

    public void add(BlogPost newPost) {
        listOfPosts.add(newPost);
    }

    public void delete(int removeIndex) {
        listOfPosts.remove(removeIndex);
    }

    public void update(int updateIndex, BlogPost updatedPost) {
        listOfPosts.set(updateIndex, updatedPost);
    }

    //Blog
    //Reuse your BlogPost class
    //Create a Blog class which can
    //store a list of BlogPosts
    //add BlogPosts to the list
    //delete(int) one item at given index
    //update(int, BlogPost) one item at the
    // given index and update it with another BlogPost
}
