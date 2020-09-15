package rocks.zipcode.quiz4.fundamentals;

import javax.management.StringValueExp;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char index = string.charAt(string.length() / 2);
        return index;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String finalAnswer = "";
        char middleChar = str.charAt(str.length() / 2);
        for (int index = 0; index < str.length(); index++)
            if (index != str.length() / 2) {
                finalAnswer += str.charAt(index);
            } else{finalAnswer += String.valueOf(middleChar).toUpperCase();
            }

        return finalAnswer;
}

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length() / 2;
        String finalAnswer = "";
        char middleChar = str.charAt(str.length() / 2);
        for (int index = 0; index < str.length(); index++)
            if (index != str.length() / 2) {
                finalAnswer += str.charAt(index);
            } else{finalAnswer += String.valueOf(middleChar).toLowerCase();
            }

        return finalAnswer;
    }

    public static Boolean isIsogram(String str) {
//        boolean isIsogram = true;
//        for(int index=0; index<str.length();index++){
//            char character = str.charAt(index);
//            //return true if each Character in string occurs exactly 1 time.
//            for(int index2 = index +1; index2<str.length(); index2++){
//                char character2 =str.charAt(index2);
//                if(character == character2){
//                    isIsogram = false;
//                    break;
//                }
//            }
//            if(!isIsogram){
//                break;
//            }
//        }
//
//        return isIsogram;
        boolean isIsogram = true;
        for(int index=0; index<str.length();index++){
            char character = str.charAt(index);
            char character2 =str.charAt(index++);
            if(character == character2){
                isIsogram = false;
                break;
            }
        }

        return isIsogram;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        boolean isAdjacent = false;
        for(int index=0; index<str.length();index++){
            char character = str.charAt(index);
            char character2 = ' ';

            if (index + 1 < str.length()){
                character2 = str.charAt(index + 1);
            }

            if(character == character2){
                isAdjacent = true;
                break;
            }
        }

        return isAdjacent;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        for(int index=0; index<str.length();index++){
            char character = str.charAt(index);
            char character2 = ' ';

            if (index + 1 < str.length()){
                character2 = str.charAt(index + 1);
            }

            if(character == character2){
                String oldChar = String.valueOf(character);
                str = str.replace(oldChar,"");
            }
        }

        return str;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for(int index=0; index<str.length();index++){
            char character = str.charAt(index);
            if(Character.isLowerCase(character)){
                String newChar = String.valueOf(Character.toUpperCase(character));
                chars[index] = newChar.charAt(0);
            } else if (Character.isUpperCase(character)){
                String newChar = String.valueOf(Character.toLowerCase(character));
                chars[index] = newChar.charAt(0);

            }
        }

        return new String(chars);
    }
}