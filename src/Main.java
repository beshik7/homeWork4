    public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();


        }

        public static void task1() {
            System.out.println(" Задача 1 ");
            int personAge = 18;
            if (personAge <= 18) {
                System.out.println("Человеку 18 или больше");
            }
            if (personAge <= 18) {
                System.out.println("Если возраст человека равен " + personAge + " он не достиг совершеннолетия, нужно немного подождать ");
            }
        }

        public static void task2() {
            System.out.println("Задача 2");
            int temp = 5;
            if (temp >= 5) {
                System.out.println("На улице " + temp + " градусов нужно надеть шапку");
            }
            if (temp <= 5) {
                System.out.println("На улице " + temp + " градусов и шапку не нужно надевать");
            }
        }

        public static void task3() {
            System.out.println("Задача 3");
            int speed = 60;
            if (speed > 60) {
                System.out.println("Если скорость больше " + speed + " км/ч, то придеется заплатить штраф");
            } else {
                System.out.println("Если скорость меньше " + speed + " км/ч, то не надо платить");
            }
        }

        public static void task4() {
            System.out.println("Задача 4");
            int age = 5;
            System.out.println("Если возраст человека составляет " + age + " лет");
            if (age >= 2 && age <= 6) {
                System.out.println(" то нужно идти в сад");
            } else if (age >= 7 && age <= 18) {
                System.out.println(" то нужно идти в школу");
            } else if (age > 18 && age > 24) {
                System.out.println(" нужно ходить в универ");
            } else if (age > 24)
                System.out.println(" нужно ходить на работу");
        }

        public static void task5() {
            System.out.println("Задача 5");
            int ageChild1 = 2;
            int ageChild2 = 7;
            int ageChild3 = 18;
            boolean adult = false;
            if (ageChild1 < 5) {
                System.out.println("Если возраст " + ageChild1 + " Не может кататься на атракционе");
            } else if (ageChild2 > 5 && ageChild2 < 14 && adult) {
                System.out.println("Если возраст " + ageChild2 + " Может кататься исключительно со взрослыми");
            } else if (ageChild3 > 14) {
                System.out.println("Если возраст " + ageChild3 + " Может кататься без сопроваждения");
            }
        }

        public static void task6() {
            System.out.println("Задача 6");
            int carriageCapacity = 102;
            int seatPlaceCapacity = 60;
            int standPlaceCapcity = carriageCapacity - seatPlaceCapacity;
            System.out.println("в вагоне  " + standPlaceCapcity + " стоячиих места");
            System.out.println("в вагоне  " + seatPlaceCapacity + " сидячих мест");
            System.out.println("в вагоне всего " + carriageCapacity + " места");

            if (seatPlaceCapacity < 60) {
                System.out.println("Если мест в вагоне сидят " + seatPlaceCapacity + "  места отсутсвуют");
            } else if
            (standPlaceCapcity < 60 && standPlaceCapcity < 102) {
                System.out.println(" Если в вагоне стоят " + standPlaceCapcity + " человека, то стоячих мест нет");

            } else if (carriageCapacity > 102) {
                System.out.println(" Если в вагоне заняты " + carriageCapacity + " то мест нет");
            }

        }

        public static void task7() {
            System.out.println("Задача 7");
            int one = 5;
            int two = 10;
            int three = 7;
            if (one >= two && one >= three) {
                System.out.println("Наибольшее число: " + one);
            } else if (two >= one && two >= three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
            }
        }
    }