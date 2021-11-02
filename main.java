import java.io.*;
import java.util.*;

// Rayan Bouamrane 260788250 No collaborators

public class main {

        public static void main(String[] args) {

                //listX (1018, '{52, 71, 34, 95, 68, 25, 44, 38, 47, 77, 92, 84, 94, 12, 61, 9, 89, 56, 28, 75}')
                //listY (1023, '{70, 54, 19, 58, 46, 14, 67, 80, 3, 93, 47, 50, 74, 72, 85, 95, 86, 91, 81, 90}')

                Chaining chainX = new Chaining(10, 2, 1018);
                Chaining chainY = new Chaining(10, 2, 1023);

                int[] listX = {52, 71, 34, 95, 68, 25, 44, 38, 47, 77, 92, 84, 94, 12, 61, 9, 89, 56, 28, 75};
                int[] listY = {70, 54, 19, 58, 46, 14, 67, 80, 3, 93, 47, 50, 74, 72, 85, 95, 86, 91, 81, 90};

                System.out.println("ChainX listX: " + chainX.insertKeyArray(listX));
                System.out.println("ChainY listY: " + chainY.insertKeyArray(listY) + "\n");

                Open_Addressing addressX = new Open_Addressing(10, 2, 1018);
                Open_Addressing addressY = new Open_Addressing(10, 2, 1023);

                System.out.println("addressX listX: " + addressX.insertKeyArray(listX));
                System.out.println("addressY listY: " + addressY.insertKeyArray(listY));
        }
}