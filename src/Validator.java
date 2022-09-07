public class Validator {

    public static boolean checkValidation(String login, String password, String confirmPassword) {
        try {
            validator(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.println(" Verification is over! ");
        }
    }

    public static void validator(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        if (login == null || login.length() >= 20) {
            throw new WrongLoginException(" Your login is less or equal to 20 characters! ");
        }
        if (password == null || confirmPassword == null || password.length() > 20) {
            throw new WrongPasswordException(" Your password is less than 20 characters! ");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" Your passwords do not match! ");
        }
    }
}
