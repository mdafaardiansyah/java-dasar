
/**
 * Provides utility methods for common String manipulations and checks
 */
public class StringTypes {

    /**
     * Concatenates a first name and a last name into a single full name string
     *
     * @param firstName The first name to be concatenated.
     * @param lastName  The last name to be concatenated
     * @return A string representing the full name, separated by a space
     */
    public String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    /**
     * Checks if a string is either null or contains only white space characters
     *
     * @param word The string to evaluate
     * @return {@code true} if the string is null or blank;
     * {@code false} otherwise
     */
    public boolean isNullOrBlank(String word){
        return word == null || word.isBlank();
    }
}

