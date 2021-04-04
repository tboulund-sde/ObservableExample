package dk.easv;

public class Main {

    private static Publisher publisher = new Publisher();
    private static Reader[] readers = new Reader[] {
            new Newsstand("The News Corner", publisher),
            new Citizen("Peter", publisher),
            new Citizen("Jane", publisher),
            new Library("Esbjerg Public Library", publisher)
    };

    private static Newspaper currentIssue = new Newspaper(
            new Article("Donald Trump says: FAKE NEWS!", "I had the most important role in Home Alone, claims ex-president"),
            new Article("Less Corona vaccines than expected", "... again"),
            new Article("New Corona-mutation found in barn", "Finding confuses experts")
    );

    private static Newspaper nextIssue = new Newspaper(
            new Article("All minks must die", "Said the Danish Prime Minister today"),
            new Article("No festivals this summer", "Organizers are furious")
    );


    public static void main(String[] args) {

        publisher.addObserver(readers[0]);
        publisher.addObserver(readers[1]);
        publisher.addObserver(readers[2]);
        publisher.addObserver(readers[3]);

        publisher.release(currentIssue);
        publisher.release(nextIssue);
        /*for(Reader reader : readers) {
            reader.read();
        }
        readers[0].read();

        publisher.release(nextIssue);
        readers[0].read();
        readers[0].read();*/
    }
}
