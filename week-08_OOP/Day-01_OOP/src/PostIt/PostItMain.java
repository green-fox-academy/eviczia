package PostIt;


public class PostItMain {
    public static void main(String[] args) {
        PostIt orangePI = new PostIt("orange", "Idea 1", "blue");
        PostIt pinkPI = new PostIt("pink", "Awesome", "black");
        PostIt yellowPI = new PostIt("yellow", "Superb!", "green");


        System.out.println(orangePI.getBackgroundColor() + " post-it with '" + orangePI.getText() + "' written in " + orangePI.getTextColor());







        //Post-it
        //Create a PostIt class that has
        //a backgroundColor
        //a text on it
        //a textColor
        //Create a few example post-it objects:
        //an orange with blue text: "Idea 1"
        //a pink with black text: "Awesome"
        //a yellow with green text: "Superb!"

    }

}
