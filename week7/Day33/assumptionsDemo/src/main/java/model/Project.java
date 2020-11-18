package model;

public class Project {
    String userName;
    String stages;
    String title;

    public Project() {
    }

    public Project(String userName, String stages, String title) {
        this.userName = userName;
        this.stages = stages;
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStages() {
        return stages;
    }

    public void setStages(String stages) {
        this.stages = stages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
