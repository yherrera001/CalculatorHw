package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] result = new String[values.length-1];
        int middleIndex = values.length/2;
        for(int checking = 0; checking < values.length-1; checking++){
            if (middleIndex == checking || checking > middleIndex){
                result[checking] = values[checking+1];
            } else {
                result[checking] = values[checking];
            }
        }

        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length-1];
        int lastIndex = values.length;
        for(int checking = 0; checking < values.length-1; checking++){
            if(checking < lastIndex){
                result[checking] = values[checking];
            }
        }
        return result;
    }
}