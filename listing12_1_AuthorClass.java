package acmepublishing;  //#A
public class Author {   
    public static int nextAuthorID = 001;   //#B
    private String lName, fName, address, email, phone;  //#C
    private int authorID;   //#C
    public Author(String fName, String lName, String address,   //#D
            String email, String phone) {   //#D
        this.lName = lName;    //#D
        this.fName = fName;    //#D
        this.address = address;   //#D
        this.email = email;   //#D
        this.phone = phone;    //#D
        this.authorID = nextAuthorID++;  //#D
    }   //#D
    public int getID() {  //#E
        return authorID;
    }  
    //add other getter and setter methods here
    @Override  //#F
    public String toString() {   //#F
        return "\n\nAuthor Information\n===================\n" + fName + " " + 
           lName + "\n" + address + "\nemail: "+email + "\nAuthor ID: " + 
           authorID;   //#F
    }    //#F
}