import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(double price);
}

// Subject Interface
interface StockMarket {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class Stock implements StockMarket {
    private List<Observer> observers;
    private String stockSymbol;
    private double price;

    public Stock(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

// Concrete Observer
class Client implements Observer {
    private String clientName;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(double price) {
        System.out.println("Client " + clientName + " notified. New price: " + price);
    }
}

// Main Class
public class ObserverPatternExample {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", 150.00);

        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        stock.registerObserver(client1);
        stock.registerObserver(client2);

        stock.setPrice(155.00);
        stock.setPrice(160.00);
    }
}
