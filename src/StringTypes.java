public class StringTypes {
    public String fullName(String firstName, String lastName){

        return firstName + " " + lastName;
    }

    public boolean isNullOrBlank(String word){
        return word == null || word.isBlank();
    }
}

