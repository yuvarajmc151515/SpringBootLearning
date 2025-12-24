package Mac.SpringlearningBasics.Pojo;

public class Trainer {

    private int id;
    private String name;
    private String subject;
    private double experience;

    public Trainer() {
    }
    public Trainer(int id,String name,String subject,double experience){
        this.id=id;
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


}
