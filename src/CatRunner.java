public class CatRunner
{
    public static void main(String[]args)
    {
        Cat cat1 = new Cat("Staten Island", 3, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Manhattan", 7, 5);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
