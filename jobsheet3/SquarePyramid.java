package jobsheet3;

public class SquarePyramid {
    int side, height;

    SquarePyramid(int a, int b) {
        side = a;
        height = b;
    }

    int calculateArea() {
        return side * side;
    }

    double calculateVolume(int area) {
        return area * height / 3;

    }
}
