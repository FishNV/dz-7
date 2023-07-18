public class Main {

    public static void main(String[] args) {
        SolarSystem earth = SolarSystem.EARTH;
        System.out.println("Перед планетою " + earth + " знаходиться планета " + earth.prev());
        System.out.println("Ви зараз знаходитесь на планеті " + earth);
        System.out.println("Після планети " + earth + " знаходиться планета " + earth.next());
        System.out.println("Планета " + earth + " - " + earth.getPositionNumberFromSun() + " від сонця планета");
        System.out.println("Від планети " + earth + " до сонця " + earth.distanceToSun + " мільйонів кілометрів");
        System.out.println("Радіус планети " + earth + " складає " + earth.radius + " тисяч кілометрів");
    }
}

