package BlogPost;

public class BlogPostMain {
    public static void main(String[] args) {
        BlogPost johnsPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");

        BlogPost timsPost = new BlogPost();
        timsPost.setAuthorName("Tim Urban");
        timsPost.setTitle("Wait but why");
        timsPost.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");
        timsPost.setPublicationDate("2010.10.10.");

        BlogPost williamsPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n When I asked to take his picture outside one of IBM’s New York City offices,\n he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        //Create a few blog post objects:
        //"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        //Lorem ipsum dolor sit amet.
        //"Wait but why" titled by Tim Urban posted at "2010.10.10."
        //A popular long-form, stick-figure-illustrated blog about almost everything.
        //"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        //Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to
        // take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole
        // organizer profile thing.

        System.out.println(johnsPost.getTitle());
        System.out.println(williamsPost.getText());
    }
}
