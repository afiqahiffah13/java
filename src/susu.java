public class susu {
    private String boyFriend;
    public susu (String name) {
        boyFriend = name;
    }
    // constructor 
    
    
    public void setName (String name) {
        boyFriend = name;
// method 1 

    }
    public String getName () {
        return boyFriend;
        // method 2
    }
    public void simpleMessage () {
        System.out.printf ("My first boyFriend is %s ", getName());
        // method 3
    }

}