package UtilityForStrings;

public class StringUtility {

    //region Reversing Utility
    public String ReverseString(String givenString) {
        if (givenString == null || givenString.isEmpty()){
            return givenString;
        }

        if (givenString.length() > 1){
            String reversedGivenString = "";
            for(int i = givenString.length() - 1; i>= 0; i--){
                reversedGivenString = reversedGivenString + givenString.charAt(i);
            }
            return reversedGivenString;
        }
        else
        {
            return givenString;
        }
    }
    //endregion Reversing Utility

    //region Capitalization Utility
    public String CapitalizeString(String givenString)
    {
        if (givenString == null || givenString.isEmpty()){
            return givenString;
        }

        int givenStringLength = givenString.length();
        String capitalizedString = "";

        while (--givenStringLength >= 0){
            char newString = givenString.charAt(givenStringLength);
            newString = Character.toUpperCase(newString);

            capitalizedString = newString + capitalizedString;
        }
        return capitalizedString;
    }
    //endregion Capitalization Utility

    //region Lowercase Utility
    public String LowerString(String givenString) {
        if (givenString == null || givenString.isEmpty()){
            return givenString;
        }

        int givenStringLength = givenString.length();
        String capitalizedString = "";

        while (--givenStringLength >= 0){
            char newString = givenString.charAt(givenStringLength);
            newString = Character.toLowerCase(newString);

            capitalizedString = newString + capitalizedString;
        }
        return capitalizedString;
    }
    //endregion Lowercase Utility
}
