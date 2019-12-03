public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        url = url.replace("https", "https:").replace("bots", "odds");

        System.out.println(url);

        url = url.split("https")[0] + "https:" + url.split("https")[1];
        System.out.println(url.split("https").length);
        url = url.split("bots")[0] + "odds";
        System.out.println(url.split("bots").length);


    }
}
