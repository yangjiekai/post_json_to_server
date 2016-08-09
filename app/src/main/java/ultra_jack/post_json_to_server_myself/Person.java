package ultra_jack.post_json_to_server_myself;

public class Person{


    private String name;
    private String country;
    private String twitter;

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTwitter() {
        return twitter;
    }
}
