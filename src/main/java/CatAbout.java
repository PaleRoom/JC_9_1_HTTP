import com.fasterxml.jackson.annotation.JsonProperty;

public class CatAbout {

    @JsonProperty("id")
    public String id;

    @JsonProperty("text")
    public String text;

    @JsonProperty("type")
    public String type;

    @JsonProperty("user")
    public String user;

    @JsonProperty("upvotes")
    public String upvotes;


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

    public String getUpvotes() {
        return upvotes;
    }

    public CatAbout(String id, String text, String type, String user, String upvotes) {
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
