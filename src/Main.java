public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("****** 1 uzduotis *******");

        // Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.//

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("****** 2 uzduotis *******");

        //Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.//

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("****** 3 uzduotis *******");

        //Sukurkite masyvą iš dešimties augalų pavadinimų.//

        String[] augalai = new String[10];

        augalai[0] = "Begonija";
        augalai[1] = "Levanda";
        augalai[2] = "Roze";
        augalai[3] = "Tulpe";
        augalai[4] = "Pakalnute";
        augalai[5] = "Zibute";
        augalai[6] = "Saulegraza";
        augalai[7] = "Aguona";
        augalai[8] = "Naslaite";
        augalai[9] = "Azalija";

        for (int i = 0; i < augalai.length; i++) {
            System.out.println(augalai[i]);
        }

        System.out.println("****** 4 uzduotis *******");

        // Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.//

        System.out.println(augalai[0]);
        System.out.println(augalai[1]);
        System.out.println(augalai[2]);
        System.out.println(augalai[3]);
        System.out.println(augalai[4]);
        System.out.println(augalai[5]);
        System.out.println(augalai[6]);
        System.out.println(augalai[7]);
        System.out.println(augalai[8]);
        System.out.println(augalai[9]);

        System.out.println("****** 5 uzduotis *******");

        //Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).//

        for (int i = 9; i >= augalai.length; i--) {
            System.out.println(augalai.length);
        }

        System.out.println("****** 6 uzduotis *******");

        //Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius)//

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("****** 7 uzduotis *******");

        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos jo
        // nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)//

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("Tai");
        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("****** 8 uzduotis *******");

        //Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;//

        int m = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                m++;
            }
        }
        System.out.println("Number of even values: " + m);

        System.out.println("****** 9 uzduotis *******");

        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)//

        int a = 0;

        for (int i = 0; i < augalai.length; i++) {
            // System.out.println(augalai[i]);//
            // System.out.println(augalai[i].length());//
            if (augalai[i].length() < 5) {
                a++;
            }
        }
        System.out.println("Zozdiu trumpesniu nei 5 simboliai yra " + a);

        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() > 7) {
                a++;
            }
        }
        System.out.println("Zozdiu ilgesniu nei 7 simboliai yra " + a);

        System.out.println("****** 10 uzduotis *******");

        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)//

        int b = 0;

        for (int i = 0; i < augalai.length; i++) {

            if (augalai[i].length() > 5 && augalai[i].length() < 10); {
                augalai[i].length();
            }
        }
        System.out.println("Zozdiu ilgesniu nei 5 simboliai, bet trumpesniu nei 10 simboliai yra " + augalai[b].length());

        System.out.println("****** SUNKESNES UZDUOTYS *******");
        System.out.println("****** 1 uzduotis *******");

        //Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir
        //suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.//

        int sk = 0;


        for (int i = 0; i < 300; i++){
            int rnd = (int) (Math.random() * 300);

            if (rnd > 150) {
                sk++;
            }
            if (rnd > 275) {
                sk++;
                System.out.print("[" + rnd + "] ");
            } else {
                System.out.print(rnd + " ");
            }
        }

        System.out.println("        ");
        System.out.println("Skaiciu didesniu uz 150 yra " + sk);

        System.out.println("****** 2 uzduotis *******");

        //Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
        // Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.//

        String res = " " ;

        for (int i = 1; i <= 3000; i+=77) {
            if (i % 77 == 0) {
                System.out.print(i + ",");




            }
        }































    }
}

