/**
 * Demonstration of concatenation operation in mixed mode
 */

public class ConcatOperatorNumber {

    public static void main(String[] args) {
        System.out.print("(1)\t 1600 + \" Pensylvania Avenue\" is ");
        System.out.println(1600 + " Pensylvania Avenue");
        System.out.print("(2)\t \"Pensylvania Avenue \" + 1600 is ");
        System.out.println("Pensylvania Avenue " + 1600);
        System.out.print("(3)\t 563 + 34 is ");
        System.out.println( 563 + 34);
        System.out.print("(4)\t \"Victoria, NE \" + 563 + 34 is ");
        System.out.println("Victoria, NE " + 563 + 34);
        System.out.print("(5)\t 563 + 34 + \" Victoria, NE \" is ");
        System.out.println(563 + 34 + " Victoria, NE ");
        System.out.print("(6)\t \"Victoria, NE \" + (563 + 34) is ");
        System.out.println("Victoria, NE " + (563 + 34));
        System.out.print("(7)\t \"Victoria, \" + \'N\' + \'E\' + \' \' + 56334 is ");
        System.out.println("Victoria, " + 'N' + 'E' + ' ' + 56334);
        System.out.print("(8)\t 563 * 34 is ");
        System.out.println( 563 * 34);
        System.out.print("(9)\t \"Victoria, NE \" + 563 * 34 is ");
        System.out.println("Victoria, NE " + 563 * 34 );
        System.out.print("(10)\t 563 * 34 + \" Victoria, NE \" is ");
        System.out.println(563 * 34 + " Victoria, NE ");
        System.out.print("(11)\t \"Victoria, NE \" + (563 * 34) is ");
        System.out.println("Victoria, NE " + (563 * 34));
    }

}
