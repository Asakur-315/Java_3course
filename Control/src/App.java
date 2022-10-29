public class App {
    public static void main(String[] args) throws Exception {
        //task1();
        task2();
    }

    private static void task1(){
        Reader[] readers = new Reader[2];
        Book[] books = new Book[4];
        books[0] = new Book("Лучшие анекдоты", "Петросян");
        books[1] = new Book("Шутки за 300", "Д. Максим");
        books[2] = new Book("Лучшие анекдоты до нашей эры", "Эволюция");
        books[3] = new Book("Шутки природы", "Очевидец извержения Везувия");

        readers[0] = new Reader(0, "Васян", "8-800-555-35-35", "Факультет мемов");
        readers[1] = new Reader(1, "Виталя", "нет телефона", "Факультет исторических мемов");
        
        readers[0].takeBook(5);
        readers[0].returnBook(5);
        readers[0].takeBook("Мемы 2020", "Мемы 2019" , "Мемы 2022");
        readers[0].returnBook("Мемы 2020","Мемы 2019");

        readers[0].takeBook(books[0],books[1]);
        readers[0].returnBook(books[0],books[1]);

        readers[1].takeBook(6);
        readers[1].returnBook(6);
        readers[1].takeBook("Мемы Древнего Рима","Мемы Древней Греции", "Мемы Нового Времени");
        readers[1].returnBook("Мемы Древнего Рима","Мемы Древней Греции");
        readers[1].takeBook(books[1],books[2],books[3]);
        readers[1].returnBook(books[1],books[2]);
    }

    private static void task2(){
        Camry camry = new Camry(false, 2017, 43000);
        Camry camry1 = new Camry(true, 2022, 10);
        Golf golf = new Golf(false,2017,33000);
        Golf golf1 = new Golf(true,2006,180000);
        
        System.out.println(camry.getName());
        camry.accelerate(400);
        System.out.println(camry.getSpeed());

        Garage garage = new Garage(3);
        System.out.println(garage.addCar(camry));
        System.out.println(garage.addCar(camry1));
        System.out.println(garage.addCar(golf1));
        System.out.println(garage.addCar(golf));

        garage.getAutos();
        //garage.sortByPrice();
    }
}
