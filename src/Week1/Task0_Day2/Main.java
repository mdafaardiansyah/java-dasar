package Week1.Task0_Day2;//Soal Week 1 - Task 0 - Day 2

/*
Program Data Types

    Buatlah sebuah program Java dengan instruksi dibawah ini:
        I Class Week1.Task0_Day2.IntegerTypes
            a.Method kalkulasi kota dengan parameter cityA & cityB menggunakan int dan operator penambahan
            b.Method convert meter to kilometer menggunakan data type long

        II Class Week1.Task0_Day2.DecimalTypes
            a.Method kalkulasi average dengan dua parameter a, b menggunakan data type double
            b.Method kalkulasi harga + pajak dengan dua parameter float price & taxRate

        III Class Week1.Task0_Day2.StringTypes
            a.Method pembuatan full name dengan dua argument first name, last name
            b.Method pengecekan String yang mengembalikan true jika String null, empty ataupun hanya ada spasi

        IV Class Week1.Task0_Day2.BooleanTypes
            a.Method pengecekan umur diatas 18 tahun dan tidak boleh menggunakan if hanya operator

        V Class Week1.Task0_Day2.TypeCasting
            a.Method convert double ke int
            b.Method convert int ke double
        VI Class Week1.Task0_Day2.Main untuk memanggil seluruh methods yang sudah dibuat
        VII Pasang proper java doc untuk setiap method dan class

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){

            //Week1.Task0_Day2.Main Menu
            System.out.println("========== Main Menu (Choose Option) =========");
            System.out.println("1 - I. Class Integer Types");
            System.out.println("2 - II. Class Decimal Types");
            System.out.println("3 - III. Class String Types");
            System.out.println("4 - IV. Class Boolean Types");
            System.out.println("5 - V. Class TypeCasting");
            System.out.println("0. Exit");
            System.out.println("================= Choose Number (0 - 5) ? ================");

            // Save State for main menu to mainMenuType
            int mainMenuType = scanner.nextInt();

            // Clean up the remaining line for the new one
            scanner.nextLine();

            if (mainMenuType == 0) {
                isRunning = false;
                System.out.println("Thank you, program is ended");
            }

            //validation input, so this menu just can input number 1-5
            if(mainMenuType >= 1 && mainMenuType <=5){
                // Sub menu
                System.out.println("Sub menu for " + mainMenuType + " : ");
                System.out.println("1. Option A");
                System.out.println("2. Option B");
                System.out.println("Choose (1/2) ?");
            }

            int subMenuTypes = scanner.nextInt();

            //Switch Case

            switch (mainMenuType){
                //I Class Week1.Task0_Day2.IntegerTypes
                case 1:
                    if (subMenuTypes == 1){
                        System.out.println("Execute: Menu 1-A");
                        System.out.println("                 ");

                        System.out.println("Enter City A Distances (Meter) : ");
                        int cityA = scanner.nextInt();

                        System.out.println("Enter City B Distances (Meter) : ");
                        int cityB = scanner.nextInt();

                        System.out.println("City A Distances is "+ cityA + " Meter");
                        System.out.println("City B Distances is "+ cityB + " Meter");

                        IntegerTypes itypes = new IntegerTypes();

                        //a.
                        int totalDistanceAB = itypes.totalDistanceCities(cityA, cityB);
                        System.out.println("Jadi, total jarak City A dan City B adalah " + totalDistanceAB + " Meter");

                    }else if (subMenuTypes == 2){
                        System.out.println("Enter Distances (Meter) : ");
                        int distancesMeter = scanner.nextInt();

                        IntegerTypes itypes = new IntegerTypes();

                        //b.
                        int totalDistanceToKilometer = itypes.meterToKilometer(distancesMeter);
                        System.out.println("City A Distances is "+ distancesMeter + " Meter");
                        System.out.println("So, the distances in Kilometer is " +totalDistanceToKilometer+ " KM");
                    }else{
                        System.out.println("Menu Invalid");
                    }
                    isRunning = false;
                    break;
                //II Class Week1.Task0_Day2.DecimalTypes
                case 2:
                    if (subMenuTypes == 1){
                        System.out.println("Execute: Menu 2-A");
                        System.out.println("                 ");

                        System.out.println("Enter value A : ");
                        double a = scanner.nextDouble();
                        System.out.println("Enter value B : ");
                        double b = scanner.nextDouble();

                        DecimalTypes itypes = new DecimalTypes();

                        double averageValueAnB = itypes.averageAB(a,b);
                        System.out.println("So, the average value of A and B is " + averageValueAnB);

                    } else if (subMenuTypes == 2){
                        System.out.println("Execute: Menu 2-B");
                        System.out.println("                 ");

                        System.out.println("Enter Item Price : ");
                        float a = scanner.nextFloat();
                        System.out.println("Enter Tax Rate(%) : ");
                        float b = scanner.nextFloat();

                        DecimalTypes itypes = new DecimalTypes();
                        float priceAfterTax = itypes.afterTaxPrice(a , b);
                        System.out.println("So, the Prices after Tax is " + priceAfterTax);


                    }else{
                        System.out.println("Menu Invalid");
                    }

                    isRunning = false;
                    break;

                //III Class Week1.Task0_Day2.StringTypes
                case 3:
                    if (subMenuTypes == 1){
                        System.out.println("Execute: Menu 3-A");
                        System.out.println("                 ");

                        System.out.println("Enter First Name : ");
                        String firstname = scanner.next();

                        System.out.println("Enter Last Name : ");
                        String lastname = scanner.next();

                        StringTypes itypes = new StringTypes();
                        String fullname = itypes.fullName(firstname, lastname);
                        System.out.println("So, the Fullname is " + fullname);


                    } else if (subMenuTypes == 2){
                        System.out.println("Execute: Menu 3-B");
                        System.out.println("                 ");

                        System.out.println("Enter word : ");
                        String word = scanner.nextLine();

                        StringTypes itypes = new StringTypes();
                        boolean isNullOrBlank = itypes.isNullOrBlank(word);
                        System.out.println("So, the " + word + " is "+ isNullOrBlank);

                    }else{
                        System.out.println("Menu Invalid");
                    }

                    isRunning = false;
                    break;

                //IV Class Week1.Task0_Day2.BooleanTypes
                case 4:
                    if (subMenuTypes == 1){
                        System.out.println("Execute: Menu 4-A");
                        System.out.println("                 ");

                        System.out.println("Enter Age (Year Old) : ");
                        int age  = scanner.nextInt();

                        BooleanTypes itypes = new BooleanTypes();
                        boolean isAbove18 = itypes.isAbove18YO(age);
                        System.out.println("So, the age " + age + " is "+ isAbove18);
                    } else{
                        System.out.println("Menu Invalid");
                    }

                    isRunning = false;
                    break;
                case 5: //Menu I
                    if (subMenuTypes == 1){
                        System.out.println("Execute: Menu 5-A");
                        System.out.println("                 ");

                        System.out.println("Enter a Value : ");
                        double value  = scanner.nextDouble();

                        TypeCasting itypes = new TypeCasting();
                        int integerValue = itypes.doubleToInteger(value);
                        System.out.println("So, the value integer from double is "+ integerValue);

                    } else if (subMenuTypes == 2){
                        System.out.println("Execute: Menu 5-B");
                        System.out.println("                 ");

                        System.out.println("Enter a Value. : ");
                        int value  = scanner.nextInt();

                        TypeCasting itypes = new TypeCasting();
                        double doubleValue = itypes.integerToDouble(value);
                        System.out.println("So, the value integer from double is "+ doubleValue);

                    }else{
                        System.out.println("Menu Invalid");
                    }

                    isRunning = false;
                    break;
                default:
                    System.out.println("Feature is'nt created");
            }

            scanner.close();
        }
    }
}