import java.util.Scanner;

class Volume {
    Double vol, a, b, c;

    // volume of cube
    void findVolume(Double a) {
        System.out.println("Volume of cube = " + (a * a * a));
    }

    // volume of rectangular box
    void findVolume(Double a, Double b, Double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    // volume of cylinder
    void findVolume(Double a, Double b) {
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
    }
}

class PracticalNo3 {
    public static void main(String args[]) {
        Double a, b, c;

        // Scanner class object to read input values
        Scanner s = new Scanner(System.in);

        // object of Volume class to call methods 
        Volume obj = new Volume();

        // read sides / length,breadth / radius, height from user
        // call findVolume() with parameters
        System.out.print("Enter the side of cube : ");
        a = s.nextDouble();

        obj.findVolume(a);

        System.out.print("Enter the length of the  box : ");
        a = s.nextDouble();

        System.out.print("Enter the width of the box : ");
        b = s.nextDouble();

        System.out.print("Enter the height of the box : ");
        c = s.nextDouble();

        obj.findVolume(a, b, c);

        System.out.print("Enter the radius of the cylinder : ");
        a = s.nextDouble();

        System.out.print("Enter the height of the cylinder : ");
        b = s.nextDouble();

        obj.findVolume(a, b);
    }
}
