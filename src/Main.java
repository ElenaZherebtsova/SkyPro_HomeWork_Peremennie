public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("----------------------------");
        System.out.println("Первая домашка по переменным");
        // Сложение, вычитание, деление, умножение...

        System.out.println("Задача 1");
         // Пишем код для задачи 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 2");
        // Пишем код для задачи 2
        dog = dog +4;
        cat = cat +4;
        paper = paper +4;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 3");
        // Пишем код для задачи 3
        dog = dog -3.5;
        cat = cat -1.6;
        paper = paper -7639;

        System.out.println ("dog = " + dog);
        System.out.println ("cat = " + cat);
        System.out.println ("paper = " + paper);

        System.out.println("Задача 4");
        // Пишем код для задачи 4
        var friend = 19;
        System.out.println ("friend = " + friend);
        friend = friend +2;
        System.out.println ("friend = " + friend);
        friend = friend /7;
        System.out.println ("friend = " + friend);

        System.out.println ("Задача 5");
//        Пишем код для задачи 5
        var frog = 3.5;
        System.out.println ("frog = " + frog);
        frog = frog *10;
        System.out.println ("frog = " + frog);
        frog = frog /3.5;
        System.out.println ("frog = " + frog);
        frog = frog +4;
        System.out.println ("frog = " + frog);


        System.out.println ("Задача 6");
//        Пишем код для задачи 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        System.out.println ("Общий вес двух боксёров = " + (boxer1+boxer2));

        System.out.println ("Задача 7");

        var weightDif = boxer2 - boxer1;
        System.out.println ("Разница в весе боксёров = " + weightDif);

        weightDif = boxer2 % boxer1;
        System.out.println ("Второй боксёр тяжелее первого на " +
                weightDif + " килограмм.");

        System.out.println ("Задача 8");
        var hours = 640;
        var people = hours / 8;
        System.out.println ("Всего работников в компании - " + people);
        people = people +94;
        hours = people *8;
        System.out.println ("Если в компании работает " + people +
                " человек, то всего " + hours +
                " часов работы может быть поделено между сотрудниками.");

    }

    public static void task2 () {
        System.out.println("----------------------------");
        System.out.println("Вторая домашка по переменным");
        // Целочисленные и переменные с плавающей точкой

        System.out.println("Задача 1");
        // Объявите переменные типов int, byte, short, long, float, double.
//      Названия могут быть любыми.
//      Выведите в консоль значение каждой переменной.
        int  a = -156;
        System.out.println ("Переменная типа int   a= " + a);

        byte b = 113;
        System.out.println ("Переменная типа byte   b= " +b);

        short c = -4684;
        System.out.println ("Переменная типа short  c= " +c);

        long d = 4678864458L;
        System.out.println ("Переменная типа long   d= " +d);

        float e = 43874.347f;
        System.out.println ("Переменная типа float  e= " +e);

        double f = -905874;
        System.out.println ("Переменная типа double f=" +f);

        System.out.println("Задача 2");
        // Инициализируйте переменные, используя изученные типы переменных.

        float q = 27.12f;
        long  w = 987678965549L;
        float r = 2.786f;
        int   t = 569;
        int   y = -159;
        int   u = 27897;
        int   i = 67;

        System.out.println("Задача 3");
//        Три школьных учителя, Людмила Павловна, Анна Сергеевна и
//        Екатерина Андреевна, ведут три класса.
//        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников,
//        у Екатерины Андреевны — 30 учеников.
//        Три учительницы закупили все вместе 480 листов бумаги на все три класса.
//        Посчитайте, сколько достанется листов каждому ученику.
//        Результат задачи выведите в консоль в формате:
//        «На каждого ученика рассчитано … листов бумаги».
//        Для объявления переменных не используйте тип var.

        int lp = 23;
        int as = 27;
        int ea = 30;
        int vsegoUchenikov = lp + as +ea;
        int list = 480 / vsegoUchenikov;

        System.out.println ("каждому ученику достанется по " + list + " листов бумаги.");

        System.out.println("Задача 4");
//        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
//        Какая производительность машины будет:
//      за 20 минут,
//      в сутки,
//      за 3 дня,
//      за 1 месяц?
//      Рассчитывайте производительность работы машины в том случае,
//      если она работает без перерыва заданный промежуток времени.
//      Результаты подсчетов выведите в консоль в формате:
//      «За … машина произвела … штук бутылок».

        int but = 8;
        System.out.println ("За 2 минуты машина производит " + but*2 + " бутылок.");

        int tretHour = but * 20;
        System.out.println ("За 20 минут машина произвела " + tretHour + " бутылок.");

        int sutki = but*60*24;
        System.out.println ("За сутки машина произвела " + sutki + " бутылок воды");

        int triDnya = sutki*3;
        System.out.println ("За три дня машина произвела " + triDnya + " бутылок воды.");

        int mesyac = sutki * 31;
        System.out.println ("За месяц май машина произвела " + mesyac + " бутылок воды.");


        System.out.println("Задача 5");
//На ремонт школы нужно 120 банок краски двух цветов: белой и красной.
// На один класс уходит 2 банки белой и 4 банки красной краски.
// Сколько банок каждой краски было куплено?

//Выведите результат задачи в консоль в формате:
// «В школе, где … классов, нужно … банок белой краски и … банок красной краски».


        int bel  = 2;
        int kras = 4;
        int klassov = 120 / (bel+kras);
        System.out.println ("В школе, в которой " + klassov + " классов, нужно " +
                bel*klassov + " банок белой краски и " + kras*klassov +
                " банок красной краски.");


        System.out.println("Задача 6");
//      Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
//      Вот один из рецептов, по которому спортсмен готовит себе завтрак:
//      Бананы — 5 штук (1 банан — 80 грамм).
//      Молоко — 200 мл (100 мл = 105 грамм).
//      Мороженое-пломбир — 2 брикета по 100 грамм.
//      Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
//      Смешать всё в блендере — и готово.

//      Подсчитайте вес (количество граммов) такого спортзавтрака,
//      а затем переведите его в килограммы.
//
//      Результат в граммах и килограммах напечатайте в консоль.

        int banana    = 80;
        int milk      = 105;
        int iceCream  = 100;
        int egg       = 70;
        int zavtrakGramm = 5*banana + 2*milk + 2*iceCream + 4*egg;
        float zavtrakKilo = zavtrakGramm/1000f;

        System.out.println ("Завтрак спортсмена весит " + zavtrakGramm + " грамм.");
        System.out.println ("Завтрак спортсмена весит " + zavtrakKilo + " килограмм.");



        System.out.println("Задача 7");
//Правила соревнований обновились, и спортсмену,
// чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
// Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе
// от 250 до 500 грамм в день.

//Посчитайте, сколько дней уйдет на похудение,
// если спортсмен будет терять каждый день по 250 грамм,
// а сколько — если каждый день будет худеть на 500 грамм.

//Посчитайте, сколько может потребоваться дней в среднем,
// чтобы добиться результата похудения.

//Результаты всех подсчетов выведите в консоль.

        int ves = 7000;
        int dieta250 = 250;
        System.out.println ("Если худеть на 250гв день, то можно придти в форму за "
                + ves/dieta250 + " дней.");
        int dieta500 = 500;
        System.out.println ("Если худеть на 500г в день, то можно придти в форму за "
                + ves/dieta500 + " дней.");
        int dietaSrednee = (dieta500 + dieta250) / 2;
        System.out.println ("В среднем можно придти в форму за " +
                ves/dietaSrednee + " дней.");



        System.out.println("Задача 8");

//Представим, что мы работаем в большой компании,
// штат которой состоит из нескольких сотен сотрудников.
// В компании есть правило: чем дольше сотрудник работает в компании,
// тем ценнее он для бизнеса. Поэтому сотрудники, которые работают
// в компании дольше 3 лет, получают повышение зарплаты раз в год.
// Каждый год повышение составляет 10% от текущей зарплаты.
//
//К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
// а также провести расчет для следующих сотрудников:
//
//Маша получает 67 760 рублей в месяц.
//Денис получает 83 690 рублей в месяц.
//Кристина получает 76 230 рублей в месяц.
//Каждому нужно увеличить зарплату на 10% от текущей месячной.
// Дополнительно руководитель попросил посчитать разницу между
// годовым доходом с нынешней зарплатой и после повышения.
//
//Посчитайте, сколько будет получать каждый из сотрудников,
// а также разницу между годовым доходом до и после повышения.
//
//Выведите в консоль информацию по каждому сотруднику.
// Например: «Маша теперь получает ... рублей.
// Годовой доход вырос на ... рублей».

        int Masha    = 67760;
        int Denis    = 83690;
        int Kristina = 76230;

        float Masha10    = Masha*1.1f;
        float Denis10    = Denis*1.1f;
        float Kristina10 = Kristina*1.1f;

        System.out.println ("Маша теперь получает " + Masha10 +
                " рублей. Её годовой доход вырос на " + (Masha10-Masha) + " рублей.");
        System.out.println ("Денис теперь получает " + Denis10 +
                " рублей. Его годовой доход вырос на " + (Denis10-Denis) + " рублей.");
        System.out.println ("Кристина теперь получает " + Kristina10 +
                " рублей. Её годовой доход вырос на " + (Kristina10-Kristina) + " рублей.");


    }
}