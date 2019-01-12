public class Client {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer observer = new MyTopicSubscriber("observer 1");

        topic.register(observer);

        observer.setSubject(topic);

        //check for update
        observer.update();

        topic.postMessage("Hi new post added");
    }
}
