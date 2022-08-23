import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            if (client.getTickets() > 0) {
                System.out.println(client.getName() + " " + client.getSurname() + " прокатился на аттракционе.");
                client.setTickets((client.getTickets() - 1));
                if (client.getTickets() > 0) {
                    queue.offer(client);
                    System.out.println();
                } else {
                    System.out.println("У " + client.getName() + " " + client.getSurname() + " закончились билеты");
                    System.out.println();
                }
            }
        }
        System.out.println("Очередь на аттракцион пуста!");
    }

    public static List<Person> generateClients() {
        Person person1 = new Person("John", "Snow", 3);
        Person person2 = new Person("Deieneris", "Targarien", 6);
        Person person3 = new Person("Tirion", "Lannister", 8);
        Person person4 = new Person("Bran", "Stark", 5);
        Person person5 = new Person("Arja", "Stark", 7);
        LinkedList<Person> list = new LinkedList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;
    }
}