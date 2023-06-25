// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println(" ");

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println(" ");

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println(" ");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг");
        System.out.println(" ");

        var weight = boxerTwo % boxerOne;
        System.out.println("Разница в весе бойцов " + weight + " кг");
        System.out.println(" ");

        var openingHours = 640;
        var workingDay = 8;
        var staff = openingHours / workingDay;
        System.out.println("Всего работников в компании - " + staff + " человек");

        staff = staff + 94;
        workingDay = staff * 8;
        System.out.println("Если в компании работает " + staff + " человека, то всего " + workingDay + " часа работы может быть поделено между сотрудниками");
        }
}

