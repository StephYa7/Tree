import java.util.List;

public class Research {
    public static void printChildren(String name, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonSecond());
            }
        }
    }

    public static void printTree(String name, Tree tree) {
        List<Link> links = tree.getLinks();
        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name)) {

                System.out.println(el.getLink() + " " + el.getPersonSecond());

            }
        }
    }
}
