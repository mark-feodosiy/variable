public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
         dog = dog + 4;
         cat = cat + 4;
         paper = paper + 4;
         System.out.println(dog);
         System.out.println(cat);
         System.out.println(paper);
          dog = dog - 3.5;
          cat = cat - 1.6;
          paper = paper - 7639;
          System.out.println(dog);
          System.out.println(cat);
          System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
         friend = friend + 2;
         System.out.println(friend);
          friend = friend/7;
          System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
         frog = frog * 10;
         System.out.println(frog);
          frog = frog / 3.5;
          System.out.println(frog);
           frog = frog + 4;
           System.out.println(frog);
         var weightBoxer1 = 78.2;
         var weightBoxer2 = 82.7;
         var weightBoxers = weightBoxer1 + weightBoxer2;
         var weightDifference = weightBoxer2 - weightBoxer1;
         System.out.println(weightBoxers);
         System.out.println(weightDifference);
          // var weightDifference = weightBoxer2 - weightBoxer1;
          // var weightDifference = weightBoxer2 % weightBoxer1;
        var totalHours = 640;
        var employeeHours = 8;
        var totalEmployees = totalHours / employeeHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = totalHours + (employeeHours * 94);
        System.out.println("Если в компании работает " + totalEmployees + " человек," + "то всего " + totalHours + " часов работы может быть поделено между сотрудниками");

    }
}