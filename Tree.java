import java.util.ArrayList;
import java.util.List;

public class Tree {
    private final List<Link> links = new ArrayList<Link>();

    public List<Link> getLinks() {
        return links;
    }

    public void addLink(Person person1, Person person2, Relation link1, Relation link2) {
        Link l1 = new Link(person1, person2, link1);
        Link l2 = new Link(person2, person1, link2);
        links.add(l1);
        links.add(l2);
    }


}

