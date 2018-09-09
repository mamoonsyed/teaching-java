public class myStudent {
    private int id;
    private char gender;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public myStudent(int id, char gender, String name) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
}