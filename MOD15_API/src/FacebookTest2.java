public class FacebookTest2 {
    public static void main( String[] args )  {

    	String accessToken = "EAAhTpZChkBqwBAE3yPaEBa9nbliVHxP8lgKafI5FbVEJm262rtpJf84JTYBKwS4CAqAGDg4oVH1juF7qZAYsZCGuBcvylM6dXsS2Ays0lTRIDYkJS91poAtuyfevXApKfXOFG49SqwM22HtTJS4ZAFtNVn4fGsuTJGjSTLwHXT9UT0M4BAJGAHgbCjfcZCFzoHjSNE7TwgwZDZD";
    	Version apiVersion = Version.LATEST;
    	
    	Connection<User> myFriendsResult = facebook.fetchConnection("me/friends", User.class, Parameter.with("fields", "birthday,name"));
    	
    	for(List<User> myFriendList: myFriendsResult)
	    	for(User friend: myFriendList) {
	    		System.out.println(friend.getName());
	    		System.out.println(friend.getBirthday());
	    	}
    	}
    }
}