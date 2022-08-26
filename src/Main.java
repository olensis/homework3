public class Main {
    public static void main(String[] args) {
        var homeWork3 = 3;
        System.out.println( "Домашнее задание номер" + homeWork3 );
        var newBranch = 3;

        var task = 1;
        System.out.println( "Задача №" + task );
        int cat = 5000000;
        byte apple = 7;
        short works = 7000;
        long questions = 123456789;
        float numbers = 7.5f;
        double digit = 5.6667895;
        System.out.println( "Значение переменной cat с типом int равно" + cat);
        System.out.println( "Значение переменной apple с типом byte равно" + apple);
        System.out.println( "Значение переменной works с типом short равно" + works);
        System.out.println( "Значение переменной questions с типом long равно" + questions);
        System.out.println( "Значение переменной numbers с типом float равно" + numbers);
        System.out.println( "Значение переменной digit с типом double равно" + digit);


        var task2 = 2;
        System.out.println( "Задача №" + task2 );
        float variable = 27.12f;
        long alternating = 987678965549L;
        float dog = 2.786f;
        int age = 22;
        boolean adult  = age > 18;
        short date = 569;
        short time = -159;
        short bananas = 27897;
        byte car = 67;

        var task3 = 3;
        System.out.println( "Задача №" + task3 );
        byte Lyudmila = 23;
        byte Anna = 27;
        byte Catherine = 30;
        short papers = 480;
        byte onTheStudent = (byte) (papers / (Lyudmila + Anna +Catherine));
        System.out.println ("На каждого ученика рассчитано … листов бумаги " + onTheStudent);

        var task4 = 4;
        System.out.println( "Задача №" + task4 );
        byte efficiency = 16;
        int period = 2;
        long workingCapacity = efficiency / 2;
        System.out.println ( " Работоспособность за минуту " + workingCapacity);
        period = 20;
        System.out.println ( "Время теперь " + period);
        long workingСapacity = period * workingCapacity;
        System.out.println ( " Работоспособность за 20 минут " + workingСapacity);
        period = 60;
        System.out.println ( "Время теперь " + period + "минут");
        workingCapacity = period *workingCapacity;
        System.out.println ( " Работоспособность за 60 минут " +workingCapacity );
        period = 4320;
        System.out.println ( "Время теперь " + period + "минут");
        workingCapacity = period *workingCapacity;
        System.out.println ( " Работоспособность за 3 суток " +workingCapacity );
        period = 43200;
        System.out.println ( "Время теперь " + period + "минут");
        workingCapacity = period *workingCapacity;
        System.out.println ( " Работоспособность за месяц " + workingCapacity );

        var task5 = 5;
        System.out.println( "Задача №" + task5 );

        byte cans = 120;
        byte brownCansPerClass = 4;
        byte whiteCansPerClass = 2;
        System.out.println ( "Банок краски на школу " + cans );
        System.out.println ( "Банок краски коричневой на один класс " + brownCansPerClass );
        System.out.println ( "Банок краски белой на один класс " + whiteCansPerClass );
        int Class = cans / ( brownCansPerClass + whiteCansPerClass);
        System.out.println ( " Классов к школе "  + Class);
        int brownСansForSchool = brownCansPerClass * Class;
        int whiteСansForSchool = whiteCansPerClass * Class;
        System.out.println ("В школе, где " + Class + "классов, нужно " + whiteСansForSchool + "банок белой краски и " + brownСansForSchool + " банок коричневой краски");

        var task6 = 6;

        int weightBananas = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightegg = 70;

        weightBananas = weightBananas * 5;
        weightMilk = weightMilk * 2;
        weightIceCream = weightIceCream * 2;
        weightegg = weightegg * 4;
        System.out.println ( "Бананов для рецепта" + weightBananas + " гр" );
        System.out.println ( "Молока для рецепта" + weightMilk + " гр" ) ;
        System.out.println ( "Мороженого для рецепта" + weightIceCream + " гр") ;
        System.out.println ( "Яиц для рецепта" + weightegg + " гр") ;

        int gram = weightBananas + weightegg + weightMilk + weightIceCream;
        System.out.println ( " Всего грамм" + gram);
        double kg = gram * 0.001;
        System.out.println ( " Всего кг" + kg);

        var task7= 7;
        System.out.println( "Задача №" + task7 );

        int throwOff = 7;
        short loses = 500;
        short lose = 250 ;
        throwOff = throwOff * 1000;
        int daysToLoseWeight250 = throwOff / lose;
        int daysToLoseWeight500 = throwOff / loses;
        System.out.println ( " Худеть дней " + daysToLoseWeight250 + " если терять по 250 гр. в день" );
        System.out.println ( " Худеть дней " + daysToLoseWeight500 + " если терять по 500 гр. в день" );
        int averageGram = ( lose+ loses) / 2;
        System.out.println ( " Среднее грамм " + averageGram);
        int averageDays = throwOff / averageGram;
        System.out.println ( " Среднее дней " + averageDays );
        float averageDays2 = averageDays % averageGram ;
        System.out.println ( " Среднее дней " + averageDays2 );

        var task8= 8;
        System.out.println( "Задача №" + task8 );

        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;

        int forAYearMasha = Masha * 12;
        int forAYearDenis  = Denis * 12;
        int forAYearChristina = Christina * 12;
        System.out.println ( " Доход Маши за год до повышения зп " + forAYearMasha);
        System.out.println ( " Доход Дениса за год до повышения зп " +forAYearDenis );
        System.out.println ( " Доход Кристины за год до повышения зп " +forAYearChristina );
        Masha = Masha + Masha*10 / 100;
        System.out.println ( "Доход Маши после повышения за месяц" + Masha);
        Denis = Denis + Denis *10 / 100;
        System.out.println ( "Доход Дениса после повышения за месяц" + Denis);
        Christina = Christina+ Christina*10 / 100;
        System.out.println ( "Доход Кристины после повышения за месяц" + Christina);
        int forAYearMashaNow= Masha * 12;
        int forAYearDenisNow= Denis * 12;
        int forAYearChristinaNow= Christina * 12;
        System.out.println ( " Доход Маши за год после  повышения зп " + forAYearMashaNow);
        System.out.println ( " Доход Дениса за год после  повышения зп " + forAYearDenisNow);
        System.out.println ( " Доход Кристины за год после  повышения зп " + forAYearChristinaNow);

        int differenceMasha = forAYearMashaNow -forAYearMasha;
        int differenceDenis = forAYearDenisNow - forAYearDenis ;
        int differenceChristina = forAYearChristinaNow - forAYearChristina;
        System.out.println ( " Разница дохода Маши" + differenceMasha);
        System.out.println ( " Разница дохода Дениса" + differenceDenis);
        System.out.println ( " Разница дохода Кристины" + differenceChristina);






























































    }
}