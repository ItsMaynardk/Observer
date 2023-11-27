public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new Subscriber("Juan Dela Cruz");
        Subscriber subscriber2 = new Subscriber("Newscaster");

        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        newsAgency.publishBreakingNews("PhilHealth was attacked by the Medusa ransomware group.");
    }
}