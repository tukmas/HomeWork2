public class Main {
    public static void main(String[] args) {
       // Задание 1
        System.out.println("Задание 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        //Задание 2
        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // Задание 3
        System.out.println("Задание 3");
        var dog1 = dog - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задание 6
        System.out.println("Задание 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общай вес " + totalWeight + " кг!");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг!");
        // Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница между весами бойцов (Способ №1) " + differenceWeight + " кг!");
        differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Разница между весами бойцов (Способ №2) " + differenceWeight + " кг!");
        // Задание 8
        System.out.println("Задание 8");
        var OpeningHours = 640;
        System.out.println(OpeningHours + " Общие количество часов!");
        var AmountOfWorkers = OpeningHours / 8;
        System.out.println("Всего работников в компании " + AmountOfWorkers + " человек");
        var AmountOfWorkers1 = AmountOfWorkers + 94;
        var OpeningHours1 = OpeningHours / AmountOfWorkers1;
        System.out.println("Если в компании работает " + AmountOfWorkers1 + " человек, то всего " + OpeningHours1 + " часа работы может быть поделено между сотрудниками");

    }
}


