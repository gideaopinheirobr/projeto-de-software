
public class Event {
    private String title;
    private String adress;
    private Person manager;
    private Boolean ticket;

    public Event(String title, String adress,
                  Person manager, Boolean ticket){
        
        this.title = title;
        this.adress = adress;
        this.manager = manager;
        this.ticket = ticket;
    }

    public Boolean getTicket() { return this.ticket; }
    public void handleTicket() { this.ticket = !this.ticket; }

    public String getTitle() { return this.title; }
    public void handleTitle(String newTitle) { this.title = newTitle; }

    public Person getManager() { return this.manager; }
    public void handleManager(Person manager) { this.manager = manager; }

    public String getAdress() { return this.adress; }
    public void handleAdress(String adress) { this.adress = adress; }

}