


public class App {
    public static void main(String[] args) {
        Person person = new Person("Ilia", "Filatov", "01.01.01");
        Person person1 = new Person("Natali", "Filatova", "01.01.01");
        Person person2 = new Person("Vasily", "Filatov", "01.01.02");
        Person person3 = new Person("Nikita", "Filatov", "01.01.01");
        Person person4 = new Person("Raisa", "Filatova", "01.01.01");
        Person person5 = new Person("Vlad", "Anikin", "01.01.02");
//        Person person6 = new Person("Dima", "Pashin", "01.01.01");
//        Person person7 = new Person("Nasty", "Pashina", "01.01.03");
//        Person person8 = new Person("Ira", "Pashina", "01.01.02");

        Tree tree = new Tree();
        tree.addLink(person1, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person1, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person, Relation.PARENT, Relation.CHILD);
        tree.addLink(person2, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person4, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person3, Relation.SIBLINGS, Relation.SIBLINGS);
        tree.addLink(person5, person1, Relation.SIBLINGS, Relation.SIBLINGS);
        tree.addLink(person1, person2, Relation.SPOUSES, Relation.SPOUSES);

        Research.printTree("Vasily", tree);


    }
}
