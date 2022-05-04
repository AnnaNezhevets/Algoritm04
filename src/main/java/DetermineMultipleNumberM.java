public class DetermineMultipleNumberM {

//    If M is multiple of 3 and 5 then return "Good Number".
//    If M is only multiple of 3 and not of 5 then return "Bad Number"
//    If M is only multiple of 5 and not of 3 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    public String determineMultipleNumberM(int m){
        String message = null;
        if(m % 3 == 0 && m % 5 == 0){
            message = "Good Number";
        } else if (m % 3 == 0 && m % 5 != 0){
            message = "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0){
            message = "Poor Number";
        } else if (m % 3 != 0 && m % 5 != 0){
            message = "-1";
        }

        return message;
    }
}
