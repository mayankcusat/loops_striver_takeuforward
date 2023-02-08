//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class FirstPattern {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int numberOfRows = sc.nextInt();

        FirstPattern firstPattern = new FirstPattern();

        // firstPattern.firstPatternPrint(numberOfRows);
        // firstPattern.SecondPatternPrint(numberOfRows);
        // firstPattern.ThirdPatternPrint(numberOfRows);
        // firstPattern.FourthPatternPrint(numberOfRows);
        // firstPattern.FifthPatternPrint(numberOfRows);
        // firstPattern.SixthPatternPrint(numberOfRows);
        // firstPattern.pattern7(numberOfRows);
        // firstPattern.pattern8(numberOfRows);
        // firstPattern.pattern9(numberOfRows);
        // firstPattern.pattern10(numberOfRows);
        // firstPattern.pattern11(numberOfRows);
        // firstPattern.pattern12(numberOfRows);
        // firstPattern.pattern13(numberOfRows);
        // firstPattern.pattern14(numberOfRows);
        // firstPattern.pattern15(numberOfRows);
        // firstPattern.pattern16(numberOfRows);
        // firstPattern.pattern17(numberOfRows);
        // firstPattern.pattern18(numberOfRows);
        // firstPattern.pattern19(numberOfRows);
        // firstPattern.pattern20(numberOfRows);
        // firstPattern.pattern21(numberOfRows);
        firstPattern.pattern22(numberOfRows);

    }

    void firstPatternPrint(int numberOfRows) {

        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (int columnCount = 0; columnCount <= numberOfRows; columnCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void SecondPatternPrint(int numberOfRows) {
        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (int columnCount = 0; columnCount <= rowCount; columnCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void ThirdPatternPrint(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print(columnCount);
            }
            System.out.println();
        }
    }

    void FourthPatternPrint(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print(rowCount);
            }
            System.out.println();
        }
    }

    void FifthPatternPrint(int numberOfRows) {
        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (int columnCount = numberOfRows - rowCount; columnCount > 0; columnCount--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void SixthPatternPrint(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int columnCount = 1; columnCount <= numberOfRows - rowCount + 1; columnCount++) {
                System.out.print(columnCount);
            }
            System.out.println();
        }
    }

    void pattern7(int numberOfRows) {
        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (int colBlankSpace = 0; colBlankSpace < numberOfRows - rowCount - 1; colBlankSpace++) {
                System.out.print(" ");
            }

            for (int colBlankSpace = 0; colBlankSpace < rowCount * 2 + 1; colBlankSpace++) {
                System.out.print("*");
            }

            for (int colBlankSpace = 0; colBlankSpace < numberOfRows - rowCount - 1; colBlankSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void pattern8(int numberOfRows) {
        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (int colBlankSpace = 0; colBlankSpace < rowCount; colBlankSpace++) {
                System.out.print(" ");
            }

            for (int colBlankSpace = 0; colBlankSpace < numberOfRows * 2 - 2 * rowCount - 1; colBlankSpace++) {
                System.out.print("*");
            }

            for (int colBlankSpace = 0; colBlankSpace < rowCount; colBlankSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void pattern9(int numberOfRows) {
        FirstPattern tempFirstPattern = new FirstPattern();
        tempFirstPattern.pattern7(numberOfRows);
        tempFirstPattern.pattern8(numberOfRows);
    }

    void pattern10(int numberOfRows) {

        for (int rowCount = 1; rowCount <= numberOfRows * 2 - 1; rowCount++) {
            for (int starCount = 1; starCount <= rowCount && rowCount <= numberOfRows; starCount++) {
                System.out.print("*");
            }

            for (int starCount = 1; starCount <= numberOfRows * 2 - rowCount && rowCount > numberOfRows; starCount++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void pattern11(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                if ((rowCount + columnCount) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    void pattern12(int numberOfRows) {
        // number, spaces, number

        int spaces = 2 * (numberOfRows - 1);

        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {

            // number
            for (int number = 1; number <= rowCount; number++) {
                System.out.print(number);
            }

            // spaces
            for (int printSpaces = 1; printSpaces <= spaces; printSpaces++) {
                System.out.print(" ");
            }

            // number
            for (int number = rowCount; number >= 1; number--) {
                System.out.print(number);
            }

            spaces -= 2;

            System.out.println();
        }
    }

    void pattern13(int numberOfRows) {
        int counter = 1;

        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int colCount = 1; colCount <= rowCount; colCount++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    void pattern14(int numberOfRows) {

        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (char colCount = 'A'; colCount <= 'A' + rowCount; colCount++) {
                System.out.print(colCount + " ");
            }
            System.out.println();
        }
    }

    void pattern15(int numberOfRows) {

        for (int rowCount = 0; rowCount < numberOfRows; rowCount++) {
            for (char colCount = 'A'; colCount <= 'A' + (numberOfRows - rowCount - 1); colCount++) {
                System.out.print(colCount + " ");
            }
            System.out.println();
        }
    }

    void pattern16(int numberOfRows) {

        for (char rowCount = 'A'; rowCount < 'A' + numberOfRows; rowCount++) {
            for (char colCount = 'A'; colCount <= rowCount; colCount++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
        }
    }

    void pattern17(int numberOfRows) {

        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++)

        {
            char printChar = 'A';
            int counter = 0;

            for (int colCount = 1; colCount <= numberOfRows - rowCount; colCount++) {

                System.out.print(" ");

                counter++;

            }

            for (int colCount = 1; colCount <= 2 * rowCount - 1; colCount++) {
                if ((colCount + counter) < numberOfRows) {

                    System.out.print(printChar++);
                } else {
                    System.out.print(printChar--);
                }

            }

            for (int colCount = 1; colCount <= numberOfRows - rowCount; colCount++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    void pattern18(int numberOfRows) {

        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++)

        {
            int printChar = 'A' + numberOfRows - rowCount;

            for (int colCount = 1; colCount <= rowCount; colCount++) {
                System.out.print((char) printChar++);
            }

            System.out.println();

        }
    }

    void pattern19(int numberOfRows) {

        print19UpperPart(numberOfRows);
        print19LowerPart(numberOfRows);
    }

    void print19UpperPart(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int colCount = 1; colCount <= numberOfRows - rowCount + 1; colCount++) {
                System.out.print("*");
            }

            for (int colCount = 1; colCount <= 2 * (rowCount - 1); colCount++) {
                System.out.print(" ");
            }

            for (int colCount = 1; colCount <= numberOfRows - rowCount + 1; colCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void print19LowerPart(int numberOfRows) {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int colCount = 1; colCount <= rowCount; colCount++) {
                System.out.print("*");
            }

            for (int colCount = 1; colCount <= 2 * (numberOfRows - rowCount); colCount++) {
                System.out.print(" ");
            }

            for (int colCount = 1; colCount <= rowCount; colCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern20(int numberOfRows) {

        for (int rowCount = 1; rowCount <= 2 * numberOfRows - 1; rowCount++) {
            for (int colCount = 1; colCount <= rowCount && rowCount <= numberOfRows; colCount++) {
                System.out.print("*");
            }

            for (int colCount = 1; colCount <= (2 * (numberOfRows - rowCount)) && rowCount <= numberOfRows; colCount++) {

                System.out.print(" ");
            }

            for (int colCount = 1; colCount <= rowCount && rowCount <= numberOfRows; colCount++) {
                System.out.print("*");
            }

            for (int colCount = 1; colCount <= (2 * numberOfRows) - rowCount && rowCount > numberOfRows; colCount++) {
                System.out.print("*");
            }

            for (int colCount = 1; colCount <= 2 * (rowCount - numberOfRows) && rowCount > numberOfRows; colCount++) {
                System.out.print(" ");
            }

            for (int colCount = 1; colCount <= (2 * numberOfRows) - rowCount && rowCount > numberOfRows; colCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern21(int numberOfRows)
    {
        for (int rowCount = 1; rowCount <= numberOfRows; rowCount++) {
            for (int colCount = 1; colCount <= numberOfRows; colCount++) {
                if(rowCount == 1 || rowCount == numberOfRows || colCount == 1 || colCount == numberOfRows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    void pattern22(int numberOfRows)
    {
        for (int rowCount = 0; rowCount < 2 * numberOfRows-1; rowCount++) {
            for (int colCount = 0; colCount < 2 * numberOfRows-1; colCount++) {
                int top = rowCount;
                int left = colCount;
                int bottom = (2 * numberOfRows - 2 - rowCount );
                int right = (2 * numberOfRows - 2 - colCount);
                
                System.out.print(numberOfRows - Math.min( Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

}
