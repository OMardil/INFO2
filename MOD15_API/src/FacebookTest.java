public class FacebookTest {
    public static void main( String[] args ) {

    	String accessToken = "EAAhTpZChkBqwBAE3yPaEBa9nbliVHxP8lgKafI5FbVEJm262rtpJf84JTYBKwS4CAqAGDg4oVH1juF7qZAYsZCGuBcvylM6dXsS2Ays0lTRIDYkJS91poAtuyfevXApKfXOFG49SqwM22HtTJS4ZAFtNVn4fGsuTJGjSTLwHXT9UT0M4BAJGAHgbCjfcZCFzoHjSNE7TwgwZDZD";
    	Version apiVersion = Version.LATEST;
    	
    	FacebookClient facebook = new DefaultFacebookClient(accessToken, apiVersion);
    	User me = facebook.fetchObject("me", User.class, Parameter.with("fields", "id,name,birthday,favorite_athletes"));
    	
    	
    	System.out.println(me.getName());
    	System.out.println(me.getFirstName());
    	System.out.println(me.getBirthday());
    	System.out.println(me.getBio());   
    	System.out.println(me.getBirthdayAsDate());
    	System.out.println(me.getGender());
    	
    	List<Experience> l1 = me.getFavoriteAthletes();
    	
    	for(Experience s: l1) {
    		System.out.println(s.getName());
    	}
    }
}