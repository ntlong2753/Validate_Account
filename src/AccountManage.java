import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountManage {
    private static Pattern pattern;
    private Matcher matcher;
//    private static final String PHONE_VIETTEL = "^(0|84|\\\\+84)(3[2-9]|9[6-8]|86)+[0-9]{7}$";
//    private static final String PHONE_VINAPHONE = "^0(9[14]|8[1-58])[0-9]{7}$";
//    private static final String PHONE_MOBIFONE = "^(07[06-9])[0-9]{7}$";
//    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String NAME = "^[_a-z0-9]{3,}$";
//
//    public static boolean checkAnyPhone(String phone) {
//            if (phone == null || phone.trim().isEmpty()) {
//                return false;
//            }
//            return phone.matches(PHONE_VIETTEL) ||
//                phone.matches(PHONE_VINAPHONE) ||
//                phone.matches(PHONE_MOBIFONE);
//    }
//
//    public static boolean checkEmail(String email) {
//        return email.matches(EMAIL_REGEX);
//    }

    public static boolean checkName(String name) {
        return name.matches(NAME);
    }
}
