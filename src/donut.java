public class donut {
    private String boyFriend;
    public void setName (String name) {
        boyFriend = name;

    }
    public String getName () {
        return boyFriend;
    }
    public void simpleMessage () {
        System.out.printf ("My first boyFriend is %s ", getName());
    }

}