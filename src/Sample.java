public class Sample {

    public static final String dictionary = "_0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public void checkLogin(String login) {
        for (int i = 0; i < login.length(); i++) {
            if (!dictionary.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException(" Login must contain only latin letters, numbers and underscore! ");
            }
        }
    }

    public void checkPassword(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!dictionary.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException(" Password must contain only latin letters, numbers and underscore! ");
            }
        }
    }
}
