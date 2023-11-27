import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishBreakingNews(String news) {
        System.out.println("Breaking news!");
        System.out.println("Anchor: " + news + ". Juan Dela Cruz, reporting.");

        notifySubscribers(news);

        System.out.println("Anchor: Thank you so much Juan Dela Cruz. Until next time only here in Net 25. God bless to you all!");
    }

    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}