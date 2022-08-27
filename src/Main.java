public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte a = 120;
        short b = 888;
        int c = 25250;
        long d = 1000000000L;
        float g = 1.25f;
        double h = 0.55555555555;
        System.out.println("Ответ к задаче №1");
        System.out.println("Значение переменной a c типом byte равна " + a );
        System.out.println("Значение переменной b c типом short равна " + b );
        System.out.println("Значение переменной c c типом int равна " + c );
        System.out.println("Значение переменной d c типом long равна " + d );
        System.out.println("Значение переменной g c типом float равна " + g );
        System.out.println("Значение переменной h c типом double равна " + h );

        // Задача 2
float f = 27.12f;
long j = 987678965549L;
byte k = 22;
short l = 786;
boolean m = 22 < 18;
short n = 569;
short o = -159;
int p = 27897;
byte r = 51;
System.out.println("Ответ к задаче №2");
System.out.println(f);
System.out.println(j);
System.out.println(k);
System.out.println(l);
System.out.println(n);
System.out.println(m);
System.out.println(o);
System.out.println(p);
System.out.println(r);

        // Задача 3
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        int ollStudents = lpStudents + asStudents + eaStudents;
        short sheetsOfPaper = 480;
        int sheetsPerStudent = sheetsOfPaper / ollStudents;
        System.out.println("Ответ к задаче №3");
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");

        // Задача 4
        byte machineOutput = 16;
        byte time = 2;
        int machineOutputPerOneMin = machineOutput / time;
        int machineOutputPerTwentyMin = machineOutputPerOneMin * 20;
        byte minInAnHour = 60;
        int minPerDay = minInAnHour * 24;
        int minInThreeDays = minPerDay * 3;
        int minInOneMonth = minPerDay * 31;
        System.out.println("Ответ к задаче №4");
        System.out.println("За 20 минут машина произвела " + machineOutputPerTwentyMin + " бутылок.");
        System.out.println("За сутки машина произвела " + minPerDay + " бутылок.");
        System.out.println("За 3 дня машина произвела " + minInThreeDays + " бутылок.");
        System.out.println("За 1 месяц машина произвела " + minInOneMonth + " бутылок.");

        // Задача 5
        byte totalCansOfPaint = 120;
        byte cansOfPaintPerClass = 6;
        int totalClasses = totalCansOfPaint / cansOfPaintPerClass;
        byte cansOfWhitePaintPerClass = 2;
        byte cansOfBrownPaintPerClass = 4;
        int totalCansOfWhitePaint = cansOfWhitePaintPerClass * totalClasses;
        int totalCansOfBrownPaint = cansOfBrownPaintPerClass * totalClasses;
        System.out.println("Ответ к задаче №5");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и "
        + totalCansOfBrownPaint + " банок коричневой краски.");

        // Задача 6
        byte numOfBananas = 5;
        byte oneBananaWeight = 80;
        int totalBananaWeight = numOfBananas * oneBananaWeight;
        byte weight100MlMilk = 105;
        int totalMilkWeight = weight100MlMilk * 2;
        byte numIceCream = 2;
        byte oneIceCreamWeight = 100;
        int totalIceCreamWeight = numIceCream * oneIceCreamWeight;
        byte numRawEgg = 4;
        byte oneRawEggWeight = 70;
        int totalRawEggWeight = numRawEgg * oneRawEggWeight;
        int totalBreakfastWeightInGr = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalRawEggWeight;
        float totalBreakfastWeightInKg = totalBreakfastWeightInGr / 1000f;
        System.out.println("Ответ к задаче №6");
        System.out.println("Общий вес спорт-завтрака в граммах составляет " + totalBreakfastWeightInGr +" грамм.");
        System.out.println("Общий вес спорт-завтрака в килограммах составляет " + totalBreakfastWeightInKg + " килограмм.");

        // Задача 7
        byte totalLoseWeightInKg = 7;
        int totalLoseWeightInGr = totalLoseWeightInKg * 1000;
        short reductionBy250GrPerDay = 250;
        short reductionBy500GrPerDay = 500;
        int totalWeightLossPerDay = reductionBy250GrPerDay + reductionBy500GrPerDay;
        int averageWeightLossPerDay = totalWeightLossPerDay / 2;
        int numberDaysFor250Gr = totalLoseWeightInGr / reductionBy250GrPerDay;
        int numberDaysFor500Gr = totalLoseWeightInGr / reductionBy500GrPerDay;
        int numberDaysOnAverage = totalLoseWeightInGr / averageWeightLossPerDay;
        double numberDaysOnAverageRemainder = numberDaysOnAverage % averageWeightLossPerDay;
        System.out.println("Ответ к задаче №7");
        System.out.println("Для снижения веса на 7 потребуется " + numberDaysFor250Gr + " дней, при снижении веса на 250 грамм в день.");
        System.out.println("Для снижения веса на 7 килограмм потребуется " + numberDaysFor500Gr + " дней, при снижении веса на 500 грамм в день.");
        System.out.println("Среднее снижение веса в день - " + averageWeightLossPerDay + " грамм.");
        System.out.println("Для снижения веса на 7 кг. в среднем потребуется " + numberDaysOnAverage + " дней.");
        System.out.println("По определению остатка деления в среднем потребуется " + numberDaysOnAverageRemainder + " дней.");

        // Задача 8
int pastSalaryOfMasha = 67760;
int pastSalaryOfDenis = 83690;
int pastSalaryOfKrystina = 76230;
int pastSalaryOfMashaForYear = pastSalaryOfMasha * 12;
int pastSalaryOfDenisForYear = pastSalaryOfDenis * 12;
int pastSalaryOfKrystinaForYear = pastSalaryOfKrystina * 12;
int newSalaryOfMasha = pastSalaryOfMasha + 6776;
int newSalaryOfDenis = pastSalaryOfDenis + 8369;
int newSalaryOfKrystina = pastSalaryOfKrystina + 7623;
int newSalaryOfMashaForYear = newSalaryOfMasha * 12;
int newSalaryOfDenisForYear = newSalaryOfDenis * 12;
int newSalaryOfKrystinaForYear = newSalaryOfKrystina * 12;
int salaryDiffOfMasha = newSalaryOfMashaForYear - pastSalaryOfMashaForYear;
int salaryDiffOfDenis = newSalaryOfDenisForYear - pastSalaryOfDenisForYear;
int salaryDiffOfKrystina = newSalaryOfKrystinaForYear - pastSalaryOfKrystinaForYear;
        System.out.println("Ответ к задаче №8");
System.out.println("Маша получает теперь " + newSalaryOfMasha + " рублей. Годовой доход вырос на " + salaryDiffOfMasha + " рублей.");
        System.out.println("Денис получает теперь " + newSalaryOfDenis + " рублей. Годовой доход вырос на " + salaryDiffOfDenis + " рублей.");
        System.out.println("Кристина получает теперь " + newSalaryOfKrystina + " рублей. Годовой доход вырос на " + salaryDiffOfKrystina + " рублей.");




    }
}
