public interface Observer {

    //method to update the observer, used by subject
    void update();

    void setSubject(Subject subject);
}
