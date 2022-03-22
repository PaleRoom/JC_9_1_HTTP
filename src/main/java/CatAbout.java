public class CatAbout {

    public String id;
    String text;
    public String type;
    public String user;
    public int upvotes;

    public CatAbout() {
        // Пустой конструктор
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public CatAbout(String id, String text, String type, String user, int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String toString() {
        return "CatAbout [id=" + id + ", text=" + "'" + text + "'," +
                " type=" + "'" + type + "'," + " user=" + "'" + user + "'," + " age=" + upvotes + "]";
    }
}
