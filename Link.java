public class Link {
    private final Person personFirst;
    private final Person personSecond;
    private final Relation link;

    public Link(Person personFirst, Person personSecond, Relation link) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.link = link;
    }

    public Person getPersonFirst() {

        return personFirst;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getLink() {
        return link;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Link{" +
                "personFirst=" + personFirst +
                ", personSecond=" + personSecond +
                ", link=" + link +
                '}';
    }
}



