public class Main {
    public static void main(String[] args) {
        byte a = -128;                                                //
        byte aa=127;
        System.out.println("Значение переменной с типом byte от " +a+" до "+ aa);
        short b = - 32678;
        short bb = 32767;
        System.out.println("Значение переменной с типом short от " +b+" до "+ bb);
        int c = -2147483648;
        int cc = 2147483647;
        System.out.println("Значение переменной с типом int от " +c+" до "+ cc);
        long d= -9223372036854775808L;
        long dd= 9223372036854775807L;
        System.out.println("Значение переменной с типом long от " +d+" до "+ dd);
        float q= -3.4E+38f;
        float qq= 3.4E+38f;
        System.out.println("Значение переменной с типом float от " +q+" до "+ qq);
        double g = -1.7e+308;
        double gg= 1.7e+308;
        System.out.println("Значение переменной с типом double от " +g+" до "+ gg);

        float w=27.12f;
        long r=987678965549L;
        float t= 2.786f;
        boolean o= false;
        short y= 569;
        short u = -159;
        short i=27897;
        byte n=67;

        byte teacherLP=23;
        byte teacherAS=27;
        byte teacherEA=30;
        short paper=480;
        int allStudents = teacherLP+teacherAS+teacherEA;
        int paperForStudents = paper / allStudents;
        System.out.println("На каждого ученика рассчитано "+ paperForStudents + " листов бумаги");

        byte bottlesInOneMinute= 8;
        int bottles20Minutes = bottlesInOneMinute * 20;
        byte  amountMinHour = 60;
        short amountMinDay = 1440;
        int bottlesDay = bottlesInOneMinute * amountMinDay;
        int bottles3Day = bottlesDay * 3;
        int bottlesMounth = bottlesDay * 30;
        System.out.println("За 20 минут машина произвела "+bottles20Minutes+" штук");
        System.out.println("За сутки машина произвела "+bottlesDay+" штук");
        System.out.println("За 3 суток машина произвела "+bottles3Day+" штук");
        System.out.println("За месяц машина произвела "+bottlesMounth+" штук");

        byte cansOfPaint= 120;
        byte  cansForClassroom = 6;
        int amountClassroom = cansOfPaint/cansForClassroom;
        int brownPaint = amountClassroom * 4;
        int whitePaint = amountClassroom * 2;
        System.out.println("В школе, где " + amountClassroom + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");


        byte banana = 80;
        short milk = 210;
        short icecream = 100;
        byte egg = 70;
        int recipe = milk + (banana * 5) + (icecream * 2) + (egg * 4);
        float recipeKg = recipe/1000f;
        System.out.println("рецепт в граммах - " + recipe + " гр" + ", рецепт в кг - " + recipeKg + " кг" );



        byte desiredWeightKg = 7;
        short desiredWeightGr = 7000;
        int days250Gr = desiredWeightGr / 250;
        int days500Gr = desiredWeightGr / 500;
        int meanDays = (days250Gr + days500Gr) / 2;
        System.out.println("Дней для похудения при 250 гр в день - " + days250Gr +
                " Дней для похудения при 500 гр в день - " + days500Gr +" Среднее количество дней - " + meanDays);



        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryMaria10 = salaryMaria + salaryMaria / 10;
        int salaryDenis10 = salaryDenis + salaryDenis / 10;
        int salaryKristina10 = salaryKristina + salaryKristina / 10;
        int annualIncomeMaria = salaryMaria * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;
        int annualIncomeMaria10 = salaryMaria10 * 12;
        int annualIncomeDenis10 = salaryDenis10 * 12;
        int annualIncomeKristina10 = salaryKristina10 * 12;
        int differenceMaria = annualIncomeMaria10 - annualIncomeMaria;
        int differenceDenis = annualIncomeDenis10 - annualIncomeDenis;
        int differenceKristina = annualIncomeKristina10 - annualIncomeKristina;

        System.out.println("Мария с премией получает в месяц - " + salaryMaria10 +
                ", Денис с премией получает в месяц - " + salaryDenis10 +
                ", Кристина с премией получает в месяц - "+ salaryKristina10);

        System.out.println("разница в годовом доходе Марии с премией и без - "
                +differenceMaria+ ", разница в годовом доходе Дениса с премией и без - " +differenceDenis+
                ", разница в годовом доходе Кристины с премией и без - " + differenceKristina);



























































    }
}